package com.hand;

import com.google.gson.JsonObject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JsonObject array=new JsonObject();
        
        JsonObject lan0=new JsonObject();
        lan0.addProperty("number", 0);
        lan0.addProperty("tname", "������·");
        lan0.addProperty("gname", "��Ʊ����");
        lan0.addProperty("type", "name");
        array.add(null, lan0);
        
        JsonObject lan1=new JsonObject();
        lan1.addProperty("number", 1);
        lan1.addProperty("tname", "27.55");
        lan1.addProperty("gname", "���տ��̼�");
        lan1.addProperty("type", "name");
        
        JsonObject lan2=new JsonObject();
        lan2.addProperty("number", 2);
        lan2.addProperty("tname", "27.25");
        lan2.addProperty("gname", "�������̼�");
        lan2.addProperty("type", "close");
        
        JsonObject lan4=new JsonObject();
        lan4.addProperty("number", 4);
        lan4.addProperty("tname", "27.55");
        lan4.addProperty("gname", "������߼�");
        lan4.addProperty("type", "high");
        
        JsonObject lan3=new JsonObject();
        lan3.addProperty("number", 3);
        lan3.addProperty("tname", "26.91");
        lan3.addProperty("gname", "��ǰ�۸�");
        lan3.addProperty("type", "current");
        
        JsonObject lan5=new JsonObject();
        lan5.addProperty("number", 5);
        lan5.addProperty("tname", "26.20");
        lan5.addProperty("gname", "������ͼ�");
        lan5.addProperty("type", "low");
    }
}
