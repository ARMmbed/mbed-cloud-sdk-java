
# EndpointData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**q** | **Boolean** | Queue mode (default value is false). |  [optional]
**ept** | **String** | Endpoint type. |  [optional]
**originalEp** | **String** | In case of a self-provided endpoint name that is used to initiate the device registration, mbed Cloud provides a new Device ID to be used from that point on. The new mbed-Cloud-provided Device ID is forwarded as the &#39;ep&#39; property and the original self-provided one as the optional &#39;original-ep&#39; property in a registration notification. The name and ID can then be mapped accordingly. mbed Cloud saves the original endpoint name in Device Catalog for future device registrations so there is no need to do the mapping again.   |  [optional]
**resources** | [**List&lt;ResourcesData&gt;**](ResourcesData.md) |  |  [optional]
**ep** | **String** | Unique mbed Cloud Device ID. |  [optional]


