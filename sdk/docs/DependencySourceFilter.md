

# DependencySourceFilter

Encapsulates parts of a market data rule relating not to the nature of the market data requested, but rather the nature of the thing (instrument/model) that is requesting it.  In the first instance, this includes the instrument type, asset class, and the currency of the underlying instrument.  This can be used to differentiate requests for market data according to the source of the request. See MarketDataSpecificRule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instrumentType** | **String** | Specify that a rule should only apply if the market data is requested by an instrument of a given instrument type.  If null, then no filtering on instrument type is applied. |  [optional] |
|**assetClass** | **String** | Specify that a rule should only apply if the market data is requested by an instrument of a given asset class.  If null, then no filtering on asset class is applied. |  [optional] |
|**domCcy** | **String** | Specify that a rule should only apply if the market data is requested by an instrument with a given domestic currency.  If null, then no filtering on currency is applied. |  [optional] |



