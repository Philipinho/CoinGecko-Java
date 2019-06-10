# CoinGecko-Java
Java wrapper for the CoinGecko API.
<p align="center">
    <img src="https://i.ibb.co/sRLCZk2/java-gecko-200.png" alt="java-gecko-200" alt="CoinGecko-Java logo" alt="CoinGecko-Java Logo"/>
</p>

## Usage
This API client covers all CoinGecko's API endpoints and i'll try to update it when new endpoints are added.

For complete API documentation please refer to https://www.coingecko.com/api/docs/v3.

For examples Goto: <a href="https://github.com/Philipinho/CoinGecko-Java/tree/master/src/test/java/com/litesoftwares/coingecko/examples">Examples</a>.

```
CoinGeckoApiClient client = new CoinGeckoApiClientImpl();
client.ping();
```

To get price of a currency in USD
```
client.getPrice("bitcoin",Currency.USD);
```

## License
MIT License

Copyright (c) 2019 Philip Okugbe

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
