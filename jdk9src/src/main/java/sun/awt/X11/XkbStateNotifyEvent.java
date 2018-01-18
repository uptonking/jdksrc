// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import jdk.internal.misc.Unsafe;

import sun.util.logging.PlatformLogger;
public class XkbStateNotifyEvent extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 104; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XkbStateNotifyEvent(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XkbStateNotifyEvent() {
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
	public int get_type() { log.finest("");return (Native.getInt(pData+0)); }
	public void set_type(int v) { log.finest(""); Native.putInt(pData+0, v); }
	public long get_serial() { log.finest("");return (Native.getULong(pData+8)); }
	public void set_serial(long v) { log.finest(""); Native.putULong(pData+8, v); }
	public boolean get_send_event() { log.finest("");return (Native.getBool(pData+16)); }
	public void set_send_event(boolean v) { log.finest(""); Native.putBool(pData+16, v); }
	public long get_display() { log.finest("");return (Native.getLong(pData+24)); }
	public void set_display(long v) { log.finest(""); Native.putLong(pData+24, v); }
	public long get_time() { log.finest("");return (Native.getULong(pData+32)); }
	public void set_time(long v) { log.finest(""); Native.putULong(pData+32, v); }
	public int get_xkb_type() { log.finest("");return (Native.getInt(pData+40)); }
	public void set_xkb_type(int v) { log.finest(""); Native.putInt(pData+40, v); }
	public int get_device() { log.finest("");return (Native.getInt(pData+44)); }
	public void set_device(int v) { log.finest(""); Native.putInt(pData+44, v); }
	public int get_changed() { log.finest("");return (Native.getInt(pData+48)); }
	public void set_changed(int v) { log.finest(""); Native.putInt(pData+48, v); }
	public int get_group() { log.finest("");return (Native.getInt(pData+52)); }
	public void set_group(int v) { log.finest(""); Native.putInt(pData+52, v); }
	public int get_base_group() { log.finest("");return (Native.getInt(pData+56)); }
	public void set_base_group(int v) { log.finest(""); Native.putInt(pData+56, v); }
	public int get_latched_group() { log.finest("");return (Native.getInt(pData+60)); }
	public void set_latched_group(int v) { log.finest(""); Native.putInt(pData+60, v); }
	public int get_locked_group() { log.finest("");return (Native.getInt(pData+64)); }
	public void set_locked_group(int v) { log.finest(""); Native.putInt(pData+64, v); }
	public int get_mods() { log.finest("");return (Native.getInt(pData+68)); }
	public void set_mods(int v) { log.finest(""); Native.putInt(pData+68, v); }
	public int get_base_mods() { log.finest("");return (Native.getInt(pData+72)); }
	public void set_base_mods(int v) { log.finest(""); Native.putInt(pData+72, v); }
	public int get_latched_mods() { log.finest("");return (Native.getInt(pData+76)); }
	public void set_latched_mods(int v) { log.finest(""); Native.putInt(pData+76, v); }
	public int get_locked_mods() { log.finest("");return (Native.getInt(pData+80)); }
	public void set_locked_mods(int v) { log.finest(""); Native.putInt(pData+80, v); }
	public int get_compat_state() { log.finest("");return (Native.getInt(pData+84)); }
	public void set_compat_state(int v) { log.finest(""); Native.putInt(pData+84, v); }
	public byte get_grab_mods() { log.finest("");return (Native.getByte(pData+88)); }
	public void set_grab_mods(byte v) { log.finest(""); Native.putByte(pData+88, v); }
	public byte get_compat_grab_mods() { log.finest("");return (Native.getByte(pData+89)); }
	public void set_compat_grab_mods(byte v) { log.finest(""); Native.putByte(pData+89, v); }
	public byte get_lookup_mods() { log.finest("");return (Native.getByte(pData+90)); }
	public void set_lookup_mods(byte v) { log.finest(""); Native.putByte(pData+90, v); }
	public byte get_compat_lookup_mods() { log.finest("");return (Native.getByte(pData+91)); }
	public void set_compat_lookup_mods(byte v) { log.finest(""); Native.putByte(pData+91, v); }
	public int get_ptr_buttons() { log.finest("");return (Native.getInt(pData+92)); }
	public void set_ptr_buttons(int v) { log.finest(""); Native.putInt(pData+92, v); }
	public int get_keycode() { log.finest("");return (Native.getInt(pData+96)); }
	public void set_keycode(int v) { log.finest(""); Native.putInt(pData+96, v); }
	public byte get_event_type() { log.finest("");return (Native.getByte(pData+97)); }
	public void set_event_type(byte v) { log.finest(""); Native.putByte(pData+97, v); }
	public byte get_req_major() { log.finest("");return (Native.getByte(pData+98)); }
	public void set_req_major(byte v) { log.finest(""); Native.putByte(pData+98, v); }
	public byte get_req_minor() { log.finest("");return (Native.getByte(pData+99)); }
	public void set_req_minor(byte v) { log.finest(""); Native.putByte(pData+99, v); }


	String getName() {
		return "XkbStateNotifyEvent"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(1040);

		ret.append("type = ").append( XlibWrapper.eventToString[get_type()] ).append(", ");
		ret.append("serial = ").append( get_serial() ).append(", ");
		ret.append("send_event = ").append( get_send_event() ).append(", ");
		ret.append("display = ").append( get_display() ).append(", ");
		ret.append("time = ").append( get_time() ).append(", ");
		ret.append("xkb_type = ").append( get_xkb_type() ).append(", ");
		ret.append("device = ").append( get_device() ).append(", ");
		ret.append("changed = ").append( get_changed() ).append(", ");
		ret.append("group = ").append( get_group() ).append(", ");
		ret.append("base_group = ").append( get_base_group() ).append(", ");
		ret.append("latched_group = ").append( get_latched_group() ).append(", ");
		ret.append("locked_group = ").append( get_locked_group() ).append(", ");
		ret.append("mods = ").append( get_mods() ).append(", ");
		ret.append("base_mods = ").append( get_base_mods() ).append(", ");
		ret.append("latched_mods = ").append( get_latched_mods() ).append(", ");
		ret.append("locked_mods = ").append( get_locked_mods() ).append(", ");
		ret.append("compat_state = ").append( get_compat_state() ).append(", ");
		ret.append("grab_mods = ").append( get_grab_mods() ).append(", ");
		ret.append("compat_grab_mods = ").append( get_compat_grab_mods() ).append(", ");
		ret.append("lookup_mods = ").append( get_lookup_mods() ).append(", ");
		ret.append("compat_lookup_mods = ").append( get_compat_lookup_mods() ).append(", ");
		ret.append("ptr_buttons = ").append( get_ptr_buttons() ).append(", ");
		ret.append("keycode = ").append( get_keycode() ).append(", ");
		ret.append("event_type = ").append( get_event_type() ).append(", ");
		ret.append("req_major = ").append( get_req_major() ).append(", ");
		ret.append("req_minor = ").append( get_req_minor() ).append(", ");
		return ret.toString();
	}


}



