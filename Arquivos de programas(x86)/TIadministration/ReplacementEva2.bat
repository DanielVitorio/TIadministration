	@echo off
	title TI Administration (REPARANDO EVAMIND...).
        taskkill -f -im eva*
	cd/ 
      xcopy /e /c /y \\10.127.184.2\z$\Programas\EVAMIND "c:\Program Files (x86)\EVAMIND"
	cd "Program Files (x86)\EVAMIND\Worker Systray" && start eva.worker_systray.exe
        msg * EVAMIND REPARADO COM SUCESSO!
EXIT
	