package com.topjohnwu.magisk.core.model;

import androidx.databinding.AbstractC2760z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000a.AbstractC1292YB;
import p000a.InterfaceC0467Ip;

@InterfaceC0467Ip(generateAdapter = AbstractC2760z.f8968H)
/* loaded from: classes.dex */
public final class UpdateInfo {

    /* renamed from: z */
    public final MagiskJson f9587z;

    public UpdateInfo(MagiskJson magiskJson) {
        this.f9587z = magiskJson;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateInfo) && AbstractC1292YB.m2695u(this.f9587z, ((UpdateInfo) obj).f9587z);
    }

    public final int hashCode() {
        return this.f9587z.hashCode();
    }

    public final String toString() {
        return "UpdateInfo(magisk=" + this.f9587z + ")";
    }

    public /* synthetic */ UpdateInfo(MagiskJson magiskJson, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new MagiskJson(null, 0, null, null, 15, null) : magiskJson);
    }
}
