echo off
cd C:\Eclipse\plugins\net.rim.ejde.componentpack5.0.0_5.0.0.36\components\simulator\
fledge /handheld=8900
fledgecontroller /session=8900
BatteryLevel(50)
pause
