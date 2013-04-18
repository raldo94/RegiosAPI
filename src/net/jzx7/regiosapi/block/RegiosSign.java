package net.jzx7.regiosapi.block;

import java.util.HashMap;
import java.util.Map;
import net.jzx7.jnbt.CompoundTag;
import net.jzx7.jnbt.StringTag;
import net.jzx7.jnbt.Tag;
import net.jzx7.regiosapi.exceptions.InvalidNBTData;

public class RegiosSign extends RegiosBlock implements NBTData {

	String[] signText;
	
	public RegiosSign(int id) {
		super(id);
		this.signText = new String[] { "", "", "", "" };
	}
	
	public RegiosSign(int id, String[] text) {
		super(id);
		if (signText == null) {
            this.signText = text;
        }
        this.signText = text;
	}
	
	public RegiosSign(int id, byte data, String[] text) {
		super(id, data);
		if (signText == null) {
            this.signText = new String[] { "", "", "", "" };
        }
        this.signText = text;
	}
	
	public String[] getText() {
		return signText;
	}
	
	public void setText(String[] text) {
		signText = text;
	}
	
	public String getLine(int line) {
		return signText[line];
	}
	
	public void setLine(int line, String text) {
		signText[line] = text;
	}

	@Override
	public String getNBTID() {
		return "Sign";
	}

	@Override
	public CompoundTag getNBTData() {
		Map<String, Tag> values = new HashMap<String, Tag>();
        values.put("Text1", new StringTag("Text1", signText[0]));
        values.put("Text2", new StringTag("Text2", signText[1]));
        values.put("Text3", new StringTag("Text3", signText[2]));
        values.put("Text4", new StringTag("Text4", signText[3]));
        return new CompoundTag(getNBTID(), values);
	}

	@Override
	public void setNBTData(CompoundTag nbtData) throws InvalidNBTData {
		if (nbtData == null) {
            return;
        }

        Map<String, Tag> values = nbtData.getValue();

        Tag t;

        signText = new String[] { "", "", "", "" };

        t = values.get("id");
        if (!(t instanceof StringTag) || !((StringTag) t).getValue().equals("Sign")) {
            throw new InvalidNBTData("'Sign' NBT data expected.");
        }

        t = values.get("Text1");
        if (t instanceof StringTag) {
        	signText[0] = ((StringTag) t).getValue();
        }

        t = values.get("Text2");
        if (t instanceof StringTag) {
        	signText[1] = ((StringTag) t).getValue();
        }

        t = values.get("Text3");
        if (t instanceof StringTag) {
        	signText[2] = ((StringTag) t).getValue();
        }

        t = values.get("Text4");
        if (t instanceof StringTag) {
        	signText[3] = ((StringTag) t).getValue();
        }
	}
	
}