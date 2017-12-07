package com.sahil.runtime1;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class WinRun {

	public static void main(String[] args){
		List<String> li= null;
		try{
			String line;
			
			Process p = Runtime.getRuntime().exec(System.getenv("windir")+"\\system32\\"+
			"tasklist.exe //s localhost //u "+System.getProperty("user.name"));
			BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
			li = new ArrayList<String>();
			while((line=input.readLine())!= null){
				li.add(line.split("  ")[0].trim());
				System.out.println(line);
			}
			for(int i=0;i<3;i++)
				li.remove(0);
			System.out.println(li);
			input.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		String hostName="Unknown";
		InetAddress inet ;
		try {
			inet=InetAddress.getLocalHost();
			hostName = inet.getHostName();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(li);
		System.out.println(li.contains("mgwmapp.exe"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(hostName);
		long l = new Long(0)-new Long(2000);
		System.out.println(l/1000
				);
		
	}
}
