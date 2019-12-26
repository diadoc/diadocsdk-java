package Diadoc.Api.shelf;

import java.util.Arrays;

public class ByteArraySegment {
    private byte[] data;
    private int offset;
    private int count;

    public ByteArraySegment(byte[] data, int offset, int count) {
        if (data == null)
            throw new IllegalArgumentException("data");
        if (offset < 0)
            throw new IllegalArgumentException("offset < 0");
        if (count < 0)
            throw new IllegalArgumentException("count < 0");
        if (offset + count > data.length)
            throw new IllegalArgumentException("offset+count > length");

        this.data = data;
        this.offset = offset;
        this.count = count;
    }

    public byte[] getBytes() {
        return Arrays.copyOfRange(data, offset, offset + count);
    }
}
