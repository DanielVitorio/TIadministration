	@echo off
	title TI Administration (REPARANDO CALL CONTROL...).
        taskkill -f -im mbar*
	taskkill -f -im cisk*
	cd/ 
         xcopy /e /c /y \\10.127.184.2\z$\Programas\TeleAp "c:\Program Files (x86)\TeleAp"
	 msg * CALL CONTROL REPARADO COM SUCESSO!
EXIT