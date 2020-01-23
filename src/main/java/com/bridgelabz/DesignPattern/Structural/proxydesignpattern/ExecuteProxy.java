package com.bridgelabz.DesignPattern.Structural.proxydesignpattern;

public class ExecuteProxy implements ProxyInf {
	private boolean isAdmin;
	private ProxyInf executor;
	
	public ExecuteProxy(String user, String pwd){
		if("Srijan".equals(user) && "passcode".equals(pwd)) isAdmin=true;
		executor = new ProxyImp();
	}

	@Override
	public void runCommand(String cmd) throws Exception {
		if(isAdmin){
			executor.runCommand(cmd);
		}else{
			if(cmd.trim().startsWith("rm")){
				throw new Exception("rm command is not allowed for non-admin users.");
			}else{
				executor.runCommand(cmd);
			}
		}
	
		
	}

}
