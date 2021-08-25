/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3429
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.api;

import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.model.DeletedEntityResponse;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.PerformanceReturn;
import com.finbourne.lusid.model.Portfolio;
import com.finbourne.lusid.model.PortfolioProperties;
import com.finbourne.lusid.model.Property;
import com.finbourne.lusid.model.ResourceListOfPerformanceReturn;
import com.finbourne.lusid.model.ResourceListOfPortfolio;
import com.finbourne.lusid.model.ResourceListOfProcessedCommand;
import com.finbourne.lusid.model.UpdatePortfolioRequest;
import com.finbourne.lusid.model.UpsertReturnsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PortfoliosApi
 */
@Ignore
public class PortfoliosApiTest {

    private final PortfoliosApi api = new PortfoliosApi();

    
    /**
     * Delete portfolio
     *
     * Delete a particular portfolio.                The deletion will take effect from the portfolio&#39;s creation datetime. This means that the portfolio will no longer exist at any effective datetime, as per the asAt datetime of deletion.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortfolioTest() throws ApiException {
        String scope = null;
        String code = null;
        DeletedEntityResponse response = api.deletePortfolio(scope, code);

        // TODO: test validations
    }
    
    /**
     * Delete portfolio properties
     *
     * Delete one or more properties from a particular portfolio. If the properties are time-variant then an effective datetime from which  to delete properties must be specified. If the properties are perpetual then it is invalid to specify an effective datetime for deletion.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortfolioPropertiesTest() throws ApiException {
        String scope = null;
        String code = null;
        List<String> propertyKeys = null;
        String effectiveAt = null;
        DeletedEntityResponse response = api.deletePortfolioProperties(scope, code, propertyKeys, effectiveAt);

        // TODO: test validations
    }
    
    /**
     * Get portfolio
     *
     * Retrieve the definition of a particular portfolio.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPortfolioTest() throws ApiException {
        String scope = null;
        String code = null;
        String effectiveAt = null;
        OffsetDateTime asAt = null;
        List<String> propertyKeys = null;
        Portfolio response = api.getPortfolio(scope, code, effectiveAt, asAt, propertyKeys);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Get portfolio commands
     *
     * Get all the commands that modified a particular portfolio, including any input transactions.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPortfolioCommandsTest() throws ApiException {
        String scope = null;
        String code = null;
        OffsetDateTime fromAsAt = null;
        OffsetDateTime toAsAt = null;
        String filter = null;
        String page = null;
        Integer limit = null;
        ResourceListOfProcessedCommand response = api.getPortfolioCommands(scope, code, fromAsAt, toAsAt, filter, page, limit);

        // TODO: test validations
    }
    
    /**
     * Get portfolio properties
     *
     * List all the properties of a particular portfolio.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPortfolioPropertiesTest() throws ApiException {
        String scope = null;
        String code = null;
        String effectiveAt = null;
        OffsetDateTime asAt = null;
        PortfolioProperties response = api.getPortfolioProperties(scope, code, effectiveAt, asAt);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Get Returns
     *
     * Get Returns which are on the specified portfolio.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPortfolioReturnsTest() throws ApiException {
        String scope = null;
        String code = null;
        String returnScope = null;
        String returnCode = null;
        String fromEffectiveAt = null;
        String toEffectiveAt = null;
        String period = null;
        OffsetDateTime asAt = null;
        ResourceListOfPerformanceReturn response = api.getPortfolioReturns(scope, code, returnScope, returnCode, fromEffectiveAt, toEffectiveAt, period, asAt);

        // TODO: test validations
    }
    
    /**
     * List portfolios
     *
     * List all the portfolios matching particular criteria.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPortfoliosTest() throws ApiException {
        String effectiveAt = null;
        OffsetDateTime asAt = null;
        String page = null;
        Integer start = null;
        Integer limit = null;
        String filter = null;
        String query = null;
        List<String> propertyKeys = null;
        ResourceListOfPortfolio response = api.listPortfolios(effectiveAt, asAt, page, start, limit, filter, query, propertyKeys);

        // TODO: test validations
    }
    
    /**
     * List portfolios for scope
     *
     * List all the portfolios in a particular scope.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPortfoliosForScopeTest() throws ApiException {
        String scope = null;
        String effectiveAt = null;
        OffsetDateTime asAt = null;
        String page = null;
        Integer start = null;
        Integer limit = null;
        String filter = null;
        List<String> propertyKeys = null;
        ResourceListOfPortfolio response = api.listPortfoliosForScope(scope, effectiveAt, asAt, page, start, limit, filter, propertyKeys);

        // TODO: test validations
    }
    
    /**
     * Update portfolio
     *
     * Update the definition of a particular portfolio.                Note that not all elements of a portfolio definition are  modifiable due to the potential implications for data already stored.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePortfolioTest() throws ApiException {
        String scope = null;
        String code = null;
        UpdatePortfolioRequest updatePortfolioRequest = null;
        String effectiveAt = null;
        Portfolio response = api.updatePortfolio(scope, code, updatePortfolioRequest, effectiveAt);

        // TODO: test validations
    }
    
    /**
     * Upsert portfolio properties
     *
     * Create or update one or more properties for a particular portfolio. A property is updated if it  already exists and created if it does not. All properties must be from the &#39;Portfolio&#39; domain.                Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime from which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which it is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void upsertPortfolioPropertiesTest() throws ApiException {
        String scope = null;
        String code = null;
        Map<String, Property> requestBody = null;
        PortfolioProperties response = api.upsertPortfolioProperties(scope, code, requestBody);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Upsert Returns
     *
     * Update or insert returns into the specified portfolio.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void upsertPortfolioReturnsTest() throws ApiException {
        String scope = null;
        String code = null;
        String returnScope = null;
        String returnCode = null;
        List<PerformanceReturn> performanceReturn = null;
        UpsertReturnsResponse response = api.upsertPortfolioReturns(scope, code, returnScope, returnCode, performanceReturn);

        // TODO: test validations
    }
    
}
