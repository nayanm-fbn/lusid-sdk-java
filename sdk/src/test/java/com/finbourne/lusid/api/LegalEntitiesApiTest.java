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
import com.finbourne.lusid.model.LegalEntity;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.PagedResourceListOfLegalEntity;
import com.finbourne.lusid.model.UpsertLegalEntityRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LegalEntitiesApi
 */
@Ignore
public class LegalEntitiesApiTest {

    private final LegalEntitiesApi api = new LegalEntitiesApi();

    
    /**
     * [EARLY ACCESS] Delete Legal Entity
     *
     * Delete a legal entity. Deletion will be valid from the legal entity&#39;s creation datetime.  This means that the legal entity will no longer exist at any effective datetime from the asAt datetime of deletion.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLegalEntityTest() throws ApiException {
        String idTypeScope = null;
        String idTypeCode = null;
        String code = null;
        DeletedEntityResponse response = api.deleteLegalEntity(idTypeScope, idTypeCode, code);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Get Legal Entity
     *
     * Retrieve the definition of a legal entity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLegalEntityTest() throws ApiException {
        String idTypeScope = null;
        String idTypeCode = null;
        String code = null;
        List<String> propertyKeys = null;
        String effectiveAt = null;
        OffsetDateTime asAt = null;
        LegalEntity response = api.getLegalEntity(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, asAt);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] List Legal Entities
     *
     * List legal entities which has identifier of specific identifier type&#39;s scope and code, and satisfies filter criteria.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listLegalEntitiesTest() throws ApiException {
        String idTypeScope = null;
        String idTypeCode = null;
        String effectiveAt = null;
        OffsetDateTime asAt = null;
        String page = null;
        Integer limit = null;
        String filter = null;
        List<String> propertyKeys = null;
        PagedResourceListOfLegalEntity response = api.listLegalEntities(idTypeScope, idTypeCode, effectiveAt, asAt, page, limit, filter, propertyKeys);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Upsert Legal Entity
     *
     * Create or update a legal entity
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void upsertLegalEntityTest() throws ApiException {
        UpsertLegalEntityRequest upsertLegalEntityRequest = null;
        LegalEntity response = api.upsertLegalEntity(upsertLegalEntityRequest);

        // TODO: test validations
    }
    
}
