package com.jaga.solveproblem.string;

import com.jaga.solveproblem.common.MyUtil;

import java.util.ArrayList;

public class ValidIPAddress {

    public static void main(String[] args) {
        String string = "100100";

        ArrayList<String> validIPs = new ArrayList<>();

        for (int i = 1; i < Math.min(string.length(),4); i++) {

            String[] currentIpAddParts = new String[4];
            currentIpAddParts[0]=string.substring(0,i);
            if(!isValidRange(string.substring(0,i))) {
                continue;
            }

                for (int j = i+1; j < i+Math.min(string.length()-i,4); j++) {
                    currentIpAddParts[1]=string.substring(i,j);
                    if(!isValidRange(string.substring(i,j))) {
                        continue;
                    }

                    for (int k = j+1; k < j+Math.min(string.length()-j,4); k++) {
                        currentIpAddParts[2]=string.substring(j,k);
                        currentIpAddParts[3]=string.substring(k);
                        if(isValidRange(string.substring(j,k)) && isValidRange(string.substring(k))) {
                            validIPs.add(getIPFormat(currentIpAddParts));
                        }
                    }

                }

        }

        MyUtil.print(validIPs);
    }


    public static String getIPFormat(String[] ipAddParts) {

        return new StringBuilder(ipAddParts[0]).append(".")
                .append(ipAddParts[1]).append(".")
                .append(ipAddParts[2]).append(".")
                .append(ipAddParts[3]).toString();

    }

    public static boolean isValidRange(String ipRange) {
        if(ipRange.length()>1&&ipRange.charAt(0)=='0'){
            return false;
        }
        return Integer.valueOf(ipRange)>=0&&Integer.valueOf(ipRange)<=255;
    }

}
