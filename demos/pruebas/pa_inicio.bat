cd C:\Program Files (x86)\Research In Motion\BlackBerry Smartphone Simulators 5.0.0\5.0.0.509 (8520-TIM) 
start fledge.exe /handheld=8520-TIM /session=prueba1
FledgeController.exe /session=prueba1 < "C:\Users\CeXaR\Dropbox\PYITE013\Presentables\demos\pruebas\pa_indicaciones.txt" > "C:\Users\CeXaR\Dropbox\PYITE013\Presentables\demos\pruebas\pa_resultado_prueba1.txt"
cd C:\Program Files (x86)\Research In Motion\BlackBerry Smartphone Simulators 6.0.0\6.0.0.141 (9800) 
start fledge.exe /handheld=9800 /session=prueba2
FledgeController.exe /session=prueba2 < "C:\Users\CeXaR\Dropbox\PYITE013\Presentables\demos\pruebas\pa_indicaciones.txt" > "C:\Users\CeXaR\Dropbox\PYITE013\Presentables\demos\pruebas\pa_resultado_prueba2.txt"