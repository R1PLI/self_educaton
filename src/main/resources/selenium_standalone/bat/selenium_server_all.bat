cmd /C start java -jar ../server/selenium-server-standalone-2.53.1.jar -role hub -hubConfig ../json/hubConfig.json

cmd /C start java -jar ../server/selenium-server-standalone-2.53.1.jar -role node -hub http://localhost:4444/register -nodeConfig ../json/firefoxNode.json -Dwebdriver.gecko.driver=../../drivers/geckodriver.exe -Dwebdriver.firefox.bin="C:\Program Files\Mozilla Firefox\firefox.exe

cmd /C start java -jar ../server/selenium-server-standalone-2.53.1.jar -role node -hub http://localhost:4444/register -nodeConfig ../json/chromeNode.json -Dwebdriver.chrome.driver=../../drivers/chromedriver.exe
