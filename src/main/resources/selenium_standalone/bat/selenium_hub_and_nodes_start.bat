cmd /C start/MIN java -jar ../server/selenium-server-standalone-2.53.1.jar -role hub -hubConfig ../json/hubConfig.json

cmd /C start/MIN java -jar ../server/selenium-server-standalone-2.53.1.jar -role node -hub http://localhost:4444/register -nodeConfig ../json/chromeNode.json -Dwebdriver.chrome.driver=../../drivers/chromedriver.exe

cmd /C start/MIN java -jar ../server/selenium-server-standalone-2.53.1.jar -role node -hub http://localhost:4444/register -nodeConfig ../json/firefoxNode.json
