/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pburgerapplication;

/**
 *
 * @author Ibukun
 */
public class Burgers {

private String BID;
private String BName;
private float BPrice;
private byte[] BPicture;


public Burgers(String bBID, String bBName, float bBPrice ,  byte[] bBPicture)
{
this.BID = bBID;
this.BName = bBName;
this.BPrice = bBPrice;
this.BPicture = bBPicture;
}

public String getBID()
{
return BID;
}

public String getBName()
{
return BName;
}

public float getBPrice()
{
return BPrice;
}

public byte[] getBPicture ()
{
return BPicture ;
}



}
