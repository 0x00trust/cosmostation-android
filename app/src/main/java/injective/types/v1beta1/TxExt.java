// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/types/v1beta1/tx_ext.proto

package injective.types.v1beta1;

public final class TxExt {
  private TxExt() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ExtensionOptionsWeb3TxOrBuilder extends
      // @@protoc_insertion_point(interface_extends:injective.types.v1beta1.ExtensionOptionsWeb3Tx)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * typedDataChainID used only in EIP712 Domain and should match
     * Ethereum network ID in a Web3 provider (e.g. Metamask).
     * </pre>
     *
     * <code>uint64 typedDataChainID = 1;</code>
     * @return The typedDataChainID.
     */
    long getTypedDataChainID();

    /**
     * <pre>
     * feePayer is an account address for the fee payer. It will be validated
     * during EIP712 signature checking.
     * </pre>
     *
     * <code>string feePayer = 2;</code>
     * @return The feePayer.
     */
    java.lang.String getFeePayer();
    /**
     * <pre>
     * feePayer is an account address for the fee payer. It will be validated
     * during EIP712 signature checking.
     * </pre>
     *
     * <code>string feePayer = 2;</code>
     * @return The bytes for feePayer.
     */
    com.google.protobuf.ByteString
        getFeePayerBytes();

    /**
     * <pre>
     * feePayerSig is a signature data from the fee paying account,
     * allows to perform fee delegation when using EIP712 Domain.
     * </pre>
     *
     * <code>bytes feePayerSig = 3;</code>
     * @return The feePayerSig.
     */
    com.google.protobuf.ByteString getFeePayerSig();
  }
  /**
   * Protobuf type {@code injective.types.v1beta1.ExtensionOptionsWeb3Tx}
   */
  public static final class ExtensionOptionsWeb3Tx extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:injective.types.v1beta1.ExtensionOptionsWeb3Tx)
      ExtensionOptionsWeb3TxOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExtensionOptionsWeb3Tx.newBuilder() to construct.
    private ExtensionOptionsWeb3Tx(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExtensionOptionsWeb3Tx() {
      feePayer_ = "";
      feePayerSig_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ExtensionOptionsWeb3Tx();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ExtensionOptionsWeb3Tx(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              typedDataChainID_ = input.readUInt64();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              feePayer_ = s;
              break;
            }
            case 26: {

              feePayerSig_ = input.readBytes();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return injective.types.v1beta1.TxExt.internal_static_injective_types_v1beta1_ExtensionOptionsWeb3Tx_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return injective.types.v1beta1.TxExt.internal_static_injective_types_v1beta1_ExtensionOptionsWeb3Tx_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx.class, injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx.Builder.class);
    }

    public static final int TYPEDDATACHAINID_FIELD_NUMBER = 1;
    private long typedDataChainID_;
    /**
     * <pre>
     * typedDataChainID used only in EIP712 Domain and should match
     * Ethereum network ID in a Web3 provider (e.g. Metamask).
     * </pre>
     *
     * <code>uint64 typedDataChainID = 1;</code>
     * @return The typedDataChainID.
     */
    @java.lang.Override
    public long getTypedDataChainID() {
      return typedDataChainID_;
    }

    public static final int FEEPAYER_FIELD_NUMBER = 2;
    private volatile java.lang.Object feePayer_;
    /**
     * <pre>
     * feePayer is an account address for the fee payer. It will be validated
     * during EIP712 signature checking.
     * </pre>
     *
     * <code>string feePayer = 2;</code>
     * @return The feePayer.
     */
    @java.lang.Override
    public java.lang.String getFeePayer() {
      java.lang.Object ref = feePayer_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        feePayer_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * feePayer is an account address for the fee payer. It will be validated
     * during EIP712 signature checking.
     * </pre>
     *
     * <code>string feePayer = 2;</code>
     * @return The bytes for feePayer.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFeePayerBytes() {
      java.lang.Object ref = feePayer_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        feePayer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FEEPAYERSIG_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString feePayerSig_;
    /**
     * <pre>
     * feePayerSig is a signature data from the fee paying account,
     * allows to perform fee delegation when using EIP712 Domain.
     * </pre>
     *
     * <code>bytes feePayerSig = 3;</code>
     * @return The feePayerSig.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getFeePayerSig() {
      return feePayerSig_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (typedDataChainID_ != 0L) {
        output.writeUInt64(1, typedDataChainID_);
      }
      if (!getFeePayerBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, feePayer_);
      }
      if (!feePayerSig_.isEmpty()) {
        output.writeBytes(3, feePayerSig_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (typedDataChainID_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, typedDataChainID_);
      }
      if (!getFeePayerBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, feePayer_);
      }
      if (!feePayerSig_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, feePayerSig_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx)) {
        return super.equals(obj);
      }
      injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx other = (injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx) obj;

      if (getTypedDataChainID()
          != other.getTypedDataChainID()) return false;
      if (!getFeePayer()
          .equals(other.getFeePayer())) return false;
      if (!getFeePayerSig()
          .equals(other.getFeePayerSig())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TYPEDDATACHAINID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTypedDataChainID());
      hash = (37 * hash) + FEEPAYER_FIELD_NUMBER;
      hash = (53 * hash) + getFeePayer().hashCode();
      hash = (37 * hash) + FEEPAYERSIG_FIELD_NUMBER;
      hash = (53 * hash) + getFeePayerSig().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code injective.types.v1beta1.ExtensionOptionsWeb3Tx}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:injective.types.v1beta1.ExtensionOptionsWeb3Tx)
        injective.types.v1beta1.TxExt.ExtensionOptionsWeb3TxOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return injective.types.v1beta1.TxExt.internal_static_injective_types_v1beta1_ExtensionOptionsWeb3Tx_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return injective.types.v1beta1.TxExt.internal_static_injective_types_v1beta1_ExtensionOptionsWeb3Tx_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx.class, injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx.Builder.class);
      }

      // Construct using injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        typedDataChainID_ = 0L;

        feePayer_ = "";

        feePayerSig_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return injective.types.v1beta1.TxExt.internal_static_injective_types_v1beta1_ExtensionOptionsWeb3Tx_descriptor;
      }

      @java.lang.Override
      public injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx getDefaultInstanceForType() {
        return injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx.getDefaultInstance();
      }

      @java.lang.Override
      public injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx build() {
        injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx buildPartial() {
        injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx result = new injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx(this);
        result.typedDataChainID_ = typedDataChainID_;
        result.feePayer_ = feePayer_;
        result.feePayerSig_ = feePayerSig_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx) {
          return mergeFrom((injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx other) {
        if (other == injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx.getDefaultInstance()) return this;
        if (other.getTypedDataChainID() != 0L) {
          setTypedDataChainID(other.getTypedDataChainID());
        }
        if (!other.getFeePayer().isEmpty()) {
          feePayer_ = other.feePayer_;
          onChanged();
        }
        if (other.getFeePayerSig() != com.google.protobuf.ByteString.EMPTY) {
          setFeePayerSig(other.getFeePayerSig());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long typedDataChainID_ ;
      /**
       * <pre>
       * typedDataChainID used only in EIP712 Domain and should match
       * Ethereum network ID in a Web3 provider (e.g. Metamask).
       * </pre>
       *
       * <code>uint64 typedDataChainID = 1;</code>
       * @return The typedDataChainID.
       */
      @java.lang.Override
      public long getTypedDataChainID() {
        return typedDataChainID_;
      }
      /**
       * <pre>
       * typedDataChainID used only in EIP712 Domain and should match
       * Ethereum network ID in a Web3 provider (e.g. Metamask).
       * </pre>
       *
       * <code>uint64 typedDataChainID = 1;</code>
       * @param value The typedDataChainID to set.
       * @return This builder for chaining.
       */
      public Builder setTypedDataChainID(long value) {
        
        typedDataChainID_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * typedDataChainID used only in EIP712 Domain and should match
       * Ethereum network ID in a Web3 provider (e.g. Metamask).
       * </pre>
       *
       * <code>uint64 typedDataChainID = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTypedDataChainID() {
        
        typedDataChainID_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object feePayer_ = "";
      /**
       * <pre>
       * feePayer is an account address for the fee payer. It will be validated
       * during EIP712 signature checking.
       * </pre>
       *
       * <code>string feePayer = 2;</code>
       * @return The feePayer.
       */
      public java.lang.String getFeePayer() {
        java.lang.Object ref = feePayer_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          feePayer_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * feePayer is an account address for the fee payer. It will be validated
       * during EIP712 signature checking.
       * </pre>
       *
       * <code>string feePayer = 2;</code>
       * @return The bytes for feePayer.
       */
      public com.google.protobuf.ByteString
          getFeePayerBytes() {
        java.lang.Object ref = feePayer_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          feePayer_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * feePayer is an account address for the fee payer. It will be validated
       * during EIP712 signature checking.
       * </pre>
       *
       * <code>string feePayer = 2;</code>
       * @param value The feePayer to set.
       * @return This builder for chaining.
       */
      public Builder setFeePayer(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        feePayer_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * feePayer is an account address for the fee payer. It will be validated
       * during EIP712 signature checking.
       * </pre>
       *
       * <code>string feePayer = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFeePayer() {
        
        feePayer_ = getDefaultInstance().getFeePayer();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * feePayer is an account address for the fee payer. It will be validated
       * during EIP712 signature checking.
       * </pre>
       *
       * <code>string feePayer = 2;</code>
       * @param value The bytes for feePayer to set.
       * @return This builder for chaining.
       */
      public Builder setFeePayerBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        feePayer_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString feePayerSig_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * feePayerSig is a signature data from the fee paying account,
       * allows to perform fee delegation when using EIP712 Domain.
       * </pre>
       *
       * <code>bytes feePayerSig = 3;</code>
       * @return The feePayerSig.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getFeePayerSig() {
        return feePayerSig_;
      }
      /**
       * <pre>
       * feePayerSig is a signature data from the fee paying account,
       * allows to perform fee delegation when using EIP712 Domain.
       * </pre>
       *
       * <code>bytes feePayerSig = 3;</code>
       * @param value The feePayerSig to set.
       * @return This builder for chaining.
       */
      public Builder setFeePayerSig(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        feePayerSig_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * feePayerSig is a signature data from the fee paying account,
       * allows to perform fee delegation when using EIP712 Domain.
       * </pre>
       *
       * <code>bytes feePayerSig = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearFeePayerSig() {
        
        feePayerSig_ = getDefaultInstance().getFeePayerSig();
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:injective.types.v1beta1.ExtensionOptionsWeb3Tx)
    }

    // @@protoc_insertion_point(class_scope:injective.types.v1beta1.ExtensionOptionsWeb3Tx)
    private static final injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx();
    }

    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ExtensionOptionsWeb3Tx>
        PARSER = new com.google.protobuf.AbstractParser<ExtensionOptionsWeb3Tx>() {
      @java.lang.Override
      public ExtensionOptionsWeb3Tx parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ExtensionOptionsWeb3Tx(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ExtensionOptionsWeb3Tx> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExtensionOptionsWeb3Tx> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_types_v1beta1_ExtensionOptionsWeb3Tx_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_types_v1beta1_ExtensionOptionsWeb3Tx_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$injective/types/v1beta1/tx_ext.proto\022\027" +
      "injective.types.v1beta1\032\024gogoproto/gogo." +
      "proto\"_\n\026ExtensionOptionsWeb3Tx\022\030\n\020typed" +
      "DataChainID\030\001 \001(\004\022\020\n\010feePayer\030\002 \001(\t\022\023\n\013f" +
      "eePayerSig\030\003 \001(\014:\004\210\240\037\000B?Z=github.com/Inj" +
      "ectiveLabs/injective-core/injective-chai" +
      "n/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf2.GoGoProtos.getDescriptor(),
        });
    internal_static_injective_types_v1beta1_ExtensionOptionsWeb3Tx_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_injective_types_v1beta1_ExtensionOptionsWeb3Tx_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_types_v1beta1_ExtensionOptionsWeb3Tx_descriptor,
        new java.lang.String[] { "TypedDataChainID", "FeePayer", "FeePayerSig", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf2.GoGoProtos.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf2.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
