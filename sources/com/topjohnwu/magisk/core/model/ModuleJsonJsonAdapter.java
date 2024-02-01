package com.topjohnwu.magisk.core.model;

import p000a.AbstractC0932RY;
import p000a.AbstractC1167Vq;
import p000a.AbstractC1235X4;
import p000a.AbstractC2626xP;
import p000a.C0657MQ;
import p000a.C1460bR;
import p000a.C1624eZ;

/* loaded from: classes.dex */
public final class ModuleJsonJsonAdapter extends AbstractC1235X4 {

    /* renamed from: h */
    public final AbstractC1235X4 f9584h;

    /* renamed from: v */
    public final AbstractC1235X4 f9585v;

    /* renamed from: z */
    public final C1624eZ f9586z = C1624eZ.m3078M("version", "versionCode", "zipUrl", "changelog");

    public ModuleJsonJsonAdapter(C0657MQ c0657mq) {
        C1460bR c1460bR = C1460bR.f4549S;
        this.f9584h = c0657mq.m1460z(String.class, c1460bR, "version");
        this.f9585v = c0657mq.m1460z(Integer.TYPE, c1460bR, "versionCode");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(ModuleJson)");
        return sb.toString();
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: v */
    public final void mo1114v(AbstractC2626xP abstractC2626xP, Object obj) {
        ModuleJson moduleJson = (ModuleJson) obj;
        if (moduleJson != null) {
            abstractC2626xP.mo3923h();
            abstractC2626xP.mo3921V("version");
            AbstractC1235X4 abstractC1235X4 = this.f9584h;
            abstractC1235X4.mo1114v(abstractC2626xP, moduleJson.f9583z);
            abstractC2626xP.mo3921V("versionCode");
            this.f9585v.mo1114v(abstractC2626xP, Integer.valueOf(moduleJson.f9581h));
            abstractC2626xP.mo3921V("zipUrl");
            abstractC1235X4.mo1114v(abstractC2626xP, moduleJson.f9582v);
            abstractC2626xP.mo3921V("changelog");
            abstractC1235X4.mo1114v(abstractC2626xP, moduleJson.f9580P);
            abstractC2626xP.mo3918G();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: z */
    public final Object mo1115z(AbstractC0932RY abstractC0932RY) {
        abstractC0932RY.mo2099h();
        String str = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        while (abstractC0932RY.mo2103y()) {
            int mo2097ZH = abstractC0932RY.mo2097ZH(this.f9586z);
            if (mo2097ZH != -1) {
                AbstractC1235X4 abstractC1235X4 = this.f9584h;
                if (mo2097ZH != 0) {
                    if (mo2097ZH != 1) {
                        if (mo2097ZH != 2) {
                            if (mo2097ZH == 3 && (str3 = (String) abstractC1235X4.mo1115z(abstractC0932RY)) == null) {
                                throw AbstractC1167Vq.m2383G("changelog", "changelog", abstractC0932RY);
                            }
                        } else {
                            str2 = (String) abstractC1235X4.mo1115z(abstractC0932RY);
                            if (str2 == null) {
                                throw AbstractC1167Vq.m2383G("zipUrl", "zipUrl", abstractC0932RY);
                            }
                        }
                    } else {
                        num = (Integer) this.f9585v.mo1115z(abstractC0932RY);
                        if (num == null) {
                            throw AbstractC1167Vq.m2383G("versionCode", "versionCode", abstractC0932RY);
                        }
                    }
                } else {
                    str = (String) abstractC1235X4.mo1115z(abstractC0932RY);
                    if (str == null) {
                        throw AbstractC1167Vq.m2383G("version", "version", abstractC0932RY);
                    }
                }
            } else {
                abstractC0932RY.mo2093Lq();
                abstractC0932RY.mo2092Ha();
            }
        }
        abstractC0932RY.mo2096V();
        if (str != null) {
            if (num != null) {
                int intValue = num.intValue();
                if (str2 != null) {
                    if (str3 != null) {
                        return new ModuleJson(str, intValue, str2, str3);
                    }
                    throw AbstractC1167Vq.m2384N("changelog", "changelog", abstractC0932RY);
                }
                throw AbstractC1167Vq.m2384N("zipUrl", "zipUrl", abstractC0932RY);
            }
            throw AbstractC1167Vq.m2384N("versionCode", "versionCode", abstractC0932RY);
        }
        throw AbstractC1167Vq.m2384N("version", "version", abstractC0932RY);
    }
}
