// automatically generated by the FlatBuffers compiler, do not modify

package org.apache.pulsar.io.kinesis.fbs;

import java.nio.*;
import java.lang.*;

import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class EncryptionKey extends Table {
  public static EncryptionKey getRootAsEncryptionKey(ByteBuffer _bb) { return getRootAsEncryptionKey(_bb, new EncryptionKey()); }
  public static EncryptionKey getRootAsEncryptionKey(ByteBuffer _bb, EncryptionKey obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public EncryptionKey __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String key() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer keyAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer keyInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public byte value(int j) { int o = __offset(6); return o != 0 ? bb.get(__vector(o) + j * 1) : 0; }
  public int valueLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer valueAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer valueInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public KeyValue metadata(int j) { return metadata(new KeyValue(), j); }
  public KeyValue metadata(KeyValue obj, int j) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int metadataLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }

  public static int createEncryptionKey(FlatBufferBuilder builder,
      int keyOffset,
      int valueOffset,
      int metadataOffset) {
    builder.startObject(3);
    EncryptionKey.addMetadata(builder, metadataOffset);
    EncryptionKey.addValue(builder, valueOffset);
    EncryptionKey.addKey(builder, keyOffset);
    return EncryptionKey.endEncryptionKey(builder);
  }

  public static void startEncryptionKey(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addKey(FlatBufferBuilder builder, int keyOffset) { builder.addOffset(0, keyOffset, 0); }
  public static void addValue(FlatBufferBuilder builder, int valueOffset) { builder.addOffset(1, valueOffset, 0); }
  public static int createValueVector(FlatBufferBuilder builder, byte[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addByte(data[i]); return builder.endVector(); }
  public static void startValueVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addMetadata(FlatBufferBuilder builder, int metadataOffset) { builder.addOffset(2, metadataOffset, 0); }
  public static int createMetadataVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startMetadataVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endEncryptionKey(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

