
public class ByteUShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char hex[]= { '0','1','2','3','4','5','6','7','8','9'
				,'a','b','c','d','e','f'
		};
		byte b= (byte) 0xf;
		byte c= (byte) (b>>4);
		byte d=(byte)(b>>>4);
		byte e= (byte) ((b & 0xff) >>4);
		
		System.out.println("b=0x"+ hex[(b>>4) &0x0f1]+hex[b&0x0f1]);
		System.out.println("b>>4=0x"+hex[(c>>4)&0x0f1+hex[c&0x0f]]);
		System.out.println("b>>>4 =0x"+hex[(d>>4)&0x0f]+hex[d&0x0f]);
		System.out.println("(b&0x0f)>>4 =0x"+hex[(e>>4)&0x0f]+hex[e&0x0f]);

	}

}
