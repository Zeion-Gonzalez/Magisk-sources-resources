package com.topjohnwu.magisk.core.model;

import androidx.databinding.AbstractC2760z;
import p000a.AbstractC1292YB;
import p000a.InterfaceC0467Ip;

@InterfaceC0467Ip(generateAdapter = AbstractC2760z.f8968H)
/* loaded from: classes.dex */
public final class ModuleJson {

    /* renamed from: P */
    public final String f9580P;

    /* renamed from: h */
    public final int f9581h;

    /* renamed from: v */
    public final String f9582v;

    /* renamed from: z */
    public final String f9583z;

    public ModuleJson(String str, int i, String str2, String str3) {
        this.f9583z = str;
        this.f9581h = i;
        this.f9582v = str2;
        this.f9580P = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModuleJson)) {
            return false;
        }
        ModuleJson moduleJson = (ModuleJson) obj;
        return AbstractC1292YB.m2695u(this.f9583z, moduleJson.f9583z) && this.f9581h == moduleJson.f9581h && AbstractC1292YB.m2695u(this.f9582v, moduleJson.f9582v) && AbstractC1292YB.m2695u(this.f9580P, moduleJson.f9580P);
    }

    public final int hashCode() {
        return this.f9580P.hashCode() + ((this.f9582v.hashCode() + (((this.f9583z.hashCode() * 31) + this.f9581h) * 31)) * 31);
    }

    public final String toString() {
        return "ModuleJson(version=" + this.f9583z + ", versionCode=" + this.f9581h + ", zipUrl=" + this.f9582v + ", changelog=" + this.f9580P + ")";
    }
}
