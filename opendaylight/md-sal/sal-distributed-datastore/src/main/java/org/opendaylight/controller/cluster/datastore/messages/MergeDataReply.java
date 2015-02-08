/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.controller.cluster.datastore.messages;

import org.opendaylight.controller.protobuff.messages.transaction.ShardTransactionMessages;

/**
 * @deprecated Replaced by BatchedModificationsReply.
 */
@Deprecated
public class MergeDataReply extends EmptyReply {
    private static final long serialVersionUID = 1L;

    private static final Object LEGACY_SERIALIZED_INSTANCE =
            ShardTransactionMessages.MergeDataReply.newBuilder().build();

    public static final MergeDataReply INSTANCE = new MergeDataReply();

    public MergeDataReply() {
        super(LEGACY_SERIALIZED_INSTANCE);
    }
}
