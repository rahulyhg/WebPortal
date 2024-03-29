<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head><title>TestNG Report</title><style type="text/css">table {margin-bottom:10px;border-collapse:collapse;empty-cells:show}th,td {border:1px solid #009;padding:.25em .5em}th {vertical-align:bottom}td {vertical-align:top}table a {font-weight:bold}.stripe td {background-color: #E6EBF9}.num {text-align:right}.passedodd td {background-color: #3F3}.passedeven td {background-color: #0A0}.skippedodd td {background-color: #DDD}.skippedeven td {background-color: #CCC}.failedodd td,.attn {background-color: #F33}.failedeven td,.stripe .attn {background-color: #D00}.stacktrace {white-space:pre;font-family:monospace}.totop {font-size:85%;text-align:center;border-bottom:2px solid #000}</style></head><body><table><tr><th>Test</th><th># Passed</th><th># Skipped</th><th># Failed</th><th>Time (ms)</th><th>Included Groups</th><th>Excluded Groups</th></tr><tr><th colspan="7">TestAll</th></tr><tr><td><a href="#t0">Login</a></td><td class="num">0</td><td class="num attn">2</td><td class="num">0</td><td class="num">64,140</td><td></td><td></td></tr></table><table><thead><tr><th>Class</th><th>Method</th><th>Start</th><th>Time (ms)</th></tr></thead><tbody><tr><th colspan="4">TestAll</th></tr></tbody><tbody id="t0"><tr><th colspan="4">Login &#8212; failed (configuration methods)</th></tr><tr class="failedeven"><td rowspan="1">com.vit.testcases.TestLogin</td><td><a href="#m0">setup</a></td><td rowspan="1">1429785293847</td><td rowspan="1">0</td></tr><tr><th colspan="4">Login &#8212; skipped (configuration methods)</th></tr><tr class="skippedeven"><td rowspan="2">com.vit.testcases.TestLogin</td><td><a href="#m1">down</a></td><td rowspan="2">1429785307673</td><td rowspan="2">0</td></tr><tr class="skippedeven"><td><a href="#m2">down</a></td></tr><tr><th colspan="4">Login &#8212; skipped</th></tr><tr class="skippedeven"><td rowspan="1">com.vit.testcases.TestLogin</td><td><a href="#m3">test_Home_Page_Appear_Correct</a></td><td rowspan="1">1429785307668</td><td rowspan="1">1</td></tr><tr class="skippedodd"><td rowspan="1">com.vit.testcases.TestReLogin</td><td><a href="#m4">test_Home_Page_Appear_Correct</a></td><td rowspan="1">1429785307671</td><td rowspan="1">1</td></tr></tbody></table><h2>Login</h2><h3 id="m0">com.vit.testcases.TestLogin#setup</h3><table class="result"><tr><th>Exception</th></tr><tr><td><div class="stacktrace">org.openqa.selenium.remote.UnreachableBrowserException: Error communicating with the remote browser. It may have died.
Build info: version: &apos;2.45.0&apos;, revision: &apos;5017cb8&apos;, time: &apos;2015-02-27 00:00:10&apos;
System info: host: &apos;odhoju&apos;, ip: &apos;192.168.73.74&apos;, os.name: &apos;Windows 7&apos;, os.arch: &apos;amd64&apos;, os.version: &apos;6.1&apos;, java.version: &apos;1.8.0_25&apos;
Driver info: driver.version: RemoteWebDriver
	at org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:593)
	at org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:304)
	at com.vit.testcases.TestReLogin.setup(TestReLogin.java:44)
Caused by: org.apache.http.conn.HttpHostConnectException: Connect to 127.0.0.1:7056 [/127.0.0.1] failed: Connection refused: connect
	at org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:142)
	at org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:319)
	at org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:363)
	at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:219)
	at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:195)
	at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:86)
	at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:108)
	at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:72)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:57)
	at org.openqa.selenium.remote.internal.ApacheHttpClient.fallBackExecute(ApacheHttpClient.java:144)
	at org.openqa.selenium.remote.internal.ApacheHttpClient.execute(ApacheHttpClient.java:72)
	at org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:133)
	at org.openqa.selenium.firefox.internal.NewProfileExtensionConnection.execute(NewProfileExtensionConnection.java:165)
	at org.openqa.selenium.firefox.FirefoxDriver$LazyCommandExecutor.execute(FirefoxDriver.java:362)
	at org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:572)
	... 24 more
Caused by: java.net.ConnectException: Connection refused: connect
	at java.net.DualStackPlainSocketImpl.waitForConnect(Native Method)
	at java.net.DualStackPlainSocketImpl.socketConnect(DualStackPlainSocketImpl.java:85)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:345)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:589)
	at org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:72)
	at org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:125)
	... 39 more
... Removed 22 stack frames</div></td></tr></table><p class="totop"><a href="#summary">back to summary</a></p><h3 id="m1">com.vit.testcases.TestLogin#down</h3><table class="result"></table><p class="totop"><a href="#summary">back to summary</a></p><h3 id="m2">com.vit.testcases.TestLogin#down</h3><table class="result"></table><p class="totop"><a href="#summary">back to summary</a></p><h3 id="m3">com.vit.testcases.TestLogin#test_Home_Page_Appear_Correct</h3><table class="result"></table><p class="totop"><a href="#summary">back to summary</a></p><h3 id="m4">com.vit.testcases.TestReLogin#test_Home_Page_Appear_Correct</h3><table class="result"></table><p class="totop"><a href="#summary">back to summary</a></p></body></html>