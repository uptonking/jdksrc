// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import jdk.internal.misc.Unsafe;

import sun.util.logging.PlatformLogger;
public class Visual extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 56; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public Visual(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public Visual() {
		log.finest("Creating");
		pData = unsafe.allocateMemory(getSize());
		should_free_memory = true;
	}


	public void dispose() {
		log.finest("Disposing");
		if (should_free_memory) {
			log.finest("freeing memory");
			unsafe.freeMemory(pData); 
	}
		}
	public XExtData get_ext_data(int index) { log.finest(""); return (Native.getLong(pData+0) != 0)?(new XExtData(Native.getLong(pData+0)+index*32)):(null); }
	public long get_ext_data() { log.finest("");return Native.getLong(pData+0); }
	public void set_ext_data(long v) { log.finest(""); Native.putLong(pData + 0, v); }
	public long get_visualid() { log.finest("");return (Native.getLong(pData+8)); }
	public void set_visualid(long v) { log.finest(""); Native.putLong(pData+8, v); }
	public int get_class() { log.finest("");return (Native.getInt(pData+16)); }
	public void set_class(int v) { log.finest(""); Native.putInt(pData+16, v); }
	public long get_red_mask() { log.finest("");return (Native.getLong(pData+24)); }
	public void set_red_mask(long v) { log.finest(""); Native.putLong(pData+24, v); }
	public long get_green_mask() { log.finest("");return (Native.getLong(pData+32)); }
	public void set_green_mask(long v) { log.finest(""); Native.putLong(pData+32, v); }
	public long get_blue_mask() { log.finest("");return (Native.getLong(pData+40)); }
	public void set_blue_mask(long v) { log.finest(""); Native.putLong(pData+40, v); }
	public int get_bits_per_rgb() { log.finest("");return (Native.getInt(pData+48)); }
	public void set_bits_per_rgb(int v) { log.finest(""); Native.putInt(pData+48, v); }
	public int get_map_entries() { log.finest("");return (Native.getInt(pData+52)); }
	public void set_map_entries(int v) { log.finest(""); Native.putInt(pData+52, v); }


	String getName() {
		return "Visual"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(320);

		ret.append("ext_data = ").append( get_ext_data() ).append(", ");
		ret.append("visualid = ").append( get_visualid() ).append(", ");
		ret.append("class = ").append( get_class() ).append(", ");
		ret.append("red_mask = ").append( get_red_mask() ).append(", ");
		ret.append("green_mask = ").append( get_green_mask() ).append(", ");
		ret.append("blue_mask = ").append( get_blue_mask() ).append(", ");
		ret.append("bits_per_rgb = ").append( get_bits_per_rgb() ).append(", ");
		ret.append("map_entries = ").append( get_map_entries() ).append(", ");
		return ret.toString();
	}


}



