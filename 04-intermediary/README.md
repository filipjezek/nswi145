# Map difficulty intermediary

The intermediary expects messages in format of `MapService.UploadMap`. If a message contains a `mapDifficulty` header, the intermediary will compute the submitted map difficulty and attach the
result to the response.

## Example

```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:nsw="http://nswi145/">
   <soapenv:Header>
    <inter:mapDifficulty xmlns:inter="http://nswi145intermediary" />
  </soapenv:Header>
   <soapenv:Body>
      <nsw:UploadMap>
         <map>
            <name>Test map</name>
         </map>
         <id>0</id>
      </nsw:UploadMap>
   </soapenv:Body>
</soapenv:Envelope>
```

will result in

```xml
<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
  <S:Header>
    <inter:mapDifficulty xmlns:inter="http://nswi145intermediary">
      4.3
    </inter:mapDifficulty>
  </S:Header>
   <S:Body>
      <ns2:UploadMapResponse xmlns:ns2="http://nswi145/">
         <MapUploadResult>
            <OK>true</OK>
            <id>23</id>
         </MapUploadResult>
      </ns2:UploadMapResponse>
   </S:Body>
</S:Envelope>
```
