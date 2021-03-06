/*
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  [View Changelog](/app/apiChangelog)    #### Getting Started   ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](https://www.bitmex.com/app/restAPI).  *All* table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  *This is only a small subset of what is available, to get you started.*  Fill in the parameters and click the `Try it out!` button to try any of these queries.  * [Pricing Data](#!/Quote/Quote_get)  * [Trade Data](#!/Trade/Trade_get)  * [OrderBook Data](#!/OrderBook/OrderBook_getL2)  * [Settlement Data](#!/Settlement/Settlement_get)  * [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)    ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import java.math.BigDecimal;
import io.swagger.client.model.Error;
import io.swagger.client.model.Position;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PositionApi
 */
@Ignore
public class PositionApiTest {

    private final PositionApi api = new PositionApi();

    
    /**
     * Get your positions.
     *
     * See &lt;a href&#x3D;\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void positionGetTest() throws ApiException {
        String filter = null;
        String columns = null;
        BigDecimal count = null;
        List<Position> response = api.positionGet(filter, columns, count);

        // TODO: test validations
    }
    
    /**
     * Enable isolated margin or cross margin per-position.
     *
     * Users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void positionIsolateMarginTest() throws ApiException {
        String symbol = null;
        Boolean enabled = null;
        Position response = api.positionIsolateMargin(symbol, enabled);

        // TODO: test validations
    }
    
    /**
     * Transfer equity in or out of a position.
     *
     * When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void positionTransferIsolatedMarginTest() throws ApiException {
        String symbol = null;
        BigDecimal amount = null;
        Position response = api.positionTransferIsolatedMargin(symbol, amount);

        // TODO: test validations
    }
    
    /**
     * Choose leverage for a position.
     *
     * Users can choose an isolated leverage. This will automatically enable isolated margin.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void positionUpdateLeverageTest() throws ApiException {
        String symbol = null;
        Double leverage = null;
        Position response = api.positionUpdateLeverage(symbol, leverage);

        // TODO: test validations
    }
    
    /**
     * Update your risk limit.
     *
     * Risk Limits limit the size of positions you can trade at various margin levels. Larger positions require more margin. Please see the Risk Limit documentation for more details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void positionUpdateRiskLimitTest() throws ApiException {
        String symbol = null;
        BigDecimal riskLimit = null;
        Position response = api.positionUpdateRiskLimit(symbol, riskLimit);

        // TODO: test validations
    }
    
}
