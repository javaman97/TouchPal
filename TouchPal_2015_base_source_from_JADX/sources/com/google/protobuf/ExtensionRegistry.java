package com.google.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessage;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class ExtensionRegistry extends ExtensionRegistryLite {
    private static final ExtensionRegistry EMPTY = new ExtensionRegistry(true);
    private final Map<String, ExtensionInfo> extensionsByName;
    private final Map<DescriptorIntPair, ExtensionInfo> extensionsByNumber;

    public static ExtensionRegistry newInstance() {
        return new ExtensionRegistry();
    }

    public static ExtensionRegistry getEmptyRegistry() {
        return EMPTY;
    }

    public ExtensionRegistry getUnmodifiable() {
        return new ExtensionRegistry(this);
    }

    public static final class ExtensionInfo {
        public final Message defaultInstance;
        public final Descriptors.FieldDescriptor descriptor;

        private ExtensionInfo(Descriptors.FieldDescriptor fieldDescriptor) {
            this.descriptor = fieldDescriptor;
            this.defaultInstance = null;
        }

        private ExtensionInfo(Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            this.descriptor = fieldDescriptor;
            this.defaultInstance = message;
        }
    }

    public ExtensionInfo findExtensionByName(String str) {
        return this.extensionsByName.get(str);
    }

    public ExtensionInfo findExtensionByNumber(Descriptors.Descriptor descriptor, int i) {
        return this.extensionsByNumber.get(new DescriptorIntPair(descriptor, i));
    }

    public void add(GeneratedMessage.GeneratedExtension<?, ?> generatedExtension) {
        if (generatedExtension.getDescriptor().getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            add(new ExtensionInfo(generatedExtension.getDescriptor(), (Message) null));
        } else if (generatedExtension.getMessageDefaultInstance() == null) {
            throw new IllegalStateException("Registered message-type extension had null default instance: " + generatedExtension.getDescriptor().getFullName());
        } else {
            add(new ExtensionInfo(generatedExtension.getDescriptor(), generatedExtension.getMessageDefaultInstance()));
        }
    }

    public void add(Descriptors.FieldDescriptor fieldDescriptor) {
        if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            throw new IllegalArgumentException("ExtensionRegistry.add() must be provided a default instance when adding an embedded message extension.");
        }
        add(new ExtensionInfo(fieldDescriptor, (Message) null));
    }

    public void add(Descriptors.FieldDescriptor fieldDescriptor, Message message) {
        if (fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            throw new IllegalArgumentException("ExtensionRegistry.add() provided a default instance for a non-message extension.");
        }
        add(new ExtensionInfo(fieldDescriptor, message));
    }

    private ExtensionRegistry() {
        this.extensionsByName = new HashMap();
        this.extensionsByNumber = new HashMap();
    }

    private ExtensionRegistry(ExtensionRegistry extensionRegistry) {
        super((ExtensionRegistryLite) extensionRegistry);
        this.extensionsByName = Collections.unmodifiableMap(extensionRegistry.extensionsByName);
        this.extensionsByNumber = Collections.unmodifiableMap(extensionRegistry.extensionsByNumber);
    }

    private ExtensionRegistry(boolean z) {
        super(ExtensionRegistryLite.getEmptyRegistry());
        this.extensionsByName = Collections.emptyMap();
        this.extensionsByNumber = Collections.emptyMap();
    }

    private void add(ExtensionInfo extensionInfo) {
        if (!extensionInfo.descriptor.isExtension()) {
            throw new IllegalArgumentException("ExtensionRegistry.add() was given a FieldDescriptor for a regular (non-extension) field.");
        }
        this.extensionsByName.put(extensionInfo.descriptor.getFullName(), extensionInfo);
        this.extensionsByNumber.put(new DescriptorIntPair(extensionInfo.descriptor.getContainingType(), extensionInfo.descriptor.getNumber()), extensionInfo);
        Descriptors.FieldDescriptor fieldDescriptor = extensionInfo.descriptor;
        if (fieldDescriptor.getContainingType().getOptions().getMessageSetWireFormat() && fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && fieldDescriptor.isOptional() && fieldDescriptor.getExtensionScope() == fieldDescriptor.getMessageType()) {
            this.extensionsByName.put(fieldDescriptor.getMessageType().getFullName(), extensionInfo);
        }
    }

    private static final class DescriptorIntPair {
        private final Descriptors.Descriptor descriptor;
        private final int number;

        DescriptorIntPair(Descriptors.Descriptor descriptor2, int i) {
            this.descriptor = descriptor2;
            this.number = i;
        }

        public int hashCode() {
            return (this.descriptor.hashCode() * 65535) + this.number;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof DescriptorIntPair)) {
                return false;
            }
            DescriptorIntPair descriptorIntPair = (DescriptorIntPair) obj;
            if (this.descriptor == descriptorIntPair.descriptor && this.number == descriptorIntPair.number) {
                return true;
            }
            return false;
        }
    }
}
