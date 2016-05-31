package Diadoc.Api;

public class ByteArraySegment {
    private byte[] data;
    private int offset;
    private int count;

    public ByteArraySegment(byte[] data, int offset, int count) {
        this.data = data;
        this.offset = offset;
        this.count = count;
        if (data == null)
            throw new NullPointerException("data");
        if (offset < 0)
            throw new IllegalArgumentException("offset<0");
        if (count < 0)
            throw new IllegalArgumentException("count<0");
        if (offset + count > data.length)
            throw new IllegalArgumentException("offset+count>length");

        this.data = data;
        this.offset = offset;
        this.count = count;
    }

    public byte[] getBytes() {
        return copyOfRange(data, offset, offset+count);
    }
    
    /**
     * Copy of method Arrays.copyOfRange() introduces in Java 6 
     * @param original
     * @param from
     * @param to
     * @return
     */
    public static byte[] copyOfRange(byte[] original, int from, int to) {
        int newLength = to - from;
        if (newLength < 0)
            throw new IllegalArgumentException(from + " > " + to);
        byte[] copy = new byte[newLength];
        System.arraycopy(original, from, copy, 0,
                         Math.min(original.length - from, newLength));
        return copy;
    }
}
