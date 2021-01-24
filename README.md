# selenium-grid-sample


## Master/Hub
``` >> java -jar selenium-server-standalone-3.141.59.jar -role hub '''
<br/> Selenium Grid hub is up and running at http://<ip>:4444/grid/console
<br/> Nodes should register to http://<ip>:4444/grid/register/
<br/> Clients should connect to http://<ip>:4444/wd/hub

## Slave/Node
``` >> java -Dwebdriver.chrome.driver="C:\Users\Administrator\Downloads\chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role node  -hub  http://<hubip>:4444/grid/register/ ```
  
  


