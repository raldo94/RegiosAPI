package net.jzx7.regiosapi.block;

import java.util.HashMap;
import java.util.Map;

import net.jzx7.jnbt.ByteTag;
import net.jzx7.jnbt.CompoundTag;
import net.jzx7.jnbt.StringTag;
import net.jzx7.jnbt.Tag;
import net.jzx7.regiosapi.exceptions.InvalidNBTData;

public class RegiosNoteBlock extends RegiosBlock implements NBTData {
	
	private byte note;
	
	public RegiosNoteBlock(int id) {
		super(id);
		this.note = 0;
	}
	
	public RegiosNoteBlock(int id, byte data) {
		super(id, data);
		this.note = 0;
	}
	
	public RegiosNoteBlock(int id, byte data, byte note) {
        super(id, data);
        this.note = note;
    }

	@Override
	public String getNBTID() {
		return "Music";
	}

	@Override
	public CompoundTag getNBTData() {
		Map<String, Tag> values = new HashMap<String, Tag>();
        values.put("note", new ByteTag("note", note));
        return new CompoundTag(getNBTID(), values);
	}

	@Override
	public void setNBTData(CompoundTag nbtData) throws InvalidNBTData {
		if (nbtData == null) {
            return;
        }

        Map<String, Tag> values = nbtData.getValue();

        Tag t;

        t = values.get("id");
        if (!(t instanceof StringTag)
                || !((StringTag) t).getValue().equals("Music")) {
            throw new InvalidNBTData("'Music' tile entity expected");
        }

        t = values.get("note");
        if (t instanceof ByteTag) {
            note = ((ByteTag) t).getValue();
        }
    }

	/**
	 * @return the note
	 */
	public byte getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(byte note) {
		this.note = note;
	}
}