package com.topjohnwu.magisk.core.model;

import java.lang.reflect.Constructor;
import p000a.AbstractC0932RY;
import p000a.AbstractC1167Vq;
import p000a.AbstractC1235X4;
import p000a.AbstractC2626xP;
import p000a.C0657MQ;
import p000a.C1460bR;
import p000a.C1624eZ;

/* loaded from: classes.dex */
public final class MagiskJsonJsonAdapter extends AbstractC1235X4 {

    /* renamed from: P */
    public volatile Constructor f9576P;

    /* renamed from: h */
    public final AbstractC1235X4 f9577h;

    /* renamed from: v */
    public final AbstractC1235X4 f9578v;

    /* renamed from: z */
    public final C1624eZ f9579z = C1624eZ.m3078M("version", "versionCode", "link", "note");

    public MagiskJsonJsonAdapter(C0657MQ c0657mq) {
        C1460bR c1460bR = C1460bR.f4549S;
        this.f9577h = c0657mq.m1460z(String.class, c1460bR, "version");
        this.f9578v = c0657mq.m1460z(Integer.TYPE, c1460bR, "versionCode");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(MagiskJson)");
        return sb.toString();
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: v */
    public final void mo1114v(AbstractC2626xP abstractC2626xP, Object obj) {
        MagiskJson magiskJson = (MagiskJson) obj;
        if (magiskJson != null) {
            abstractC2626xP.mo3923h();
            abstractC2626xP.mo3921V("version");
            AbstractC1235X4 abstractC1235X4 = this.f9577h;
            abstractC1235X4.mo1114v(abstractC2626xP, magiskJson.f9574S);
            abstractC2626xP.mo3921V("versionCode");
            this.f9578v.mo1114v(abstractC2626xP, Integer.valueOf(magiskJson.f9573R));
            abstractC2626xP.mo3921V("link");
            abstractC1235X4.mo1114v(abstractC2626xP, magiskJson.f9575w);
            abstractC2626xP.mo3921V("note");
            abstractC1235X4.mo1114v(abstractC2626xP, magiskJson.f9572I);
            abstractC2626xP.mo3918G();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: z */
    public final Object mo1115z(AbstractC0932RY abstractC0932RY) {
        Integer num = 0;
        abstractC0932RY.mo2099h();
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = -1;
        while (abstractC0932RY.mo2103y()) {
            int mo2097ZH = abstractC0932RY.mo2097ZH(this.f9579z);
            if (mo2097ZH != -1) {
                if (mo2097ZH != 0) {
                    if (mo2097ZH != 1) {
                        if (mo2097ZH != 2) {
                            if (mo2097ZH == 3) {
                                str3 = (String) this.f9577h.mo1115z(abstractC0932RY);
                                if (str3 != null) {
                                    i &= -9;
                                } else {
                                    throw AbstractC1167Vq.m2383G("note", "note", abstractC0932RY);
                                }
                            } else {
                                continue;
                            }
                        } else {
                            str2 = (String) this.f9577h.mo1115z(abstractC0932RY);
                            if (str2 != null) {
                                i &= -5;
                            } else {
                                throw AbstractC1167Vq.m2383G("link", "link", abstractC0932RY);
                            }
                        }
                    } else {
                        num = (Integer) this.f9578v.mo1115z(abstractC0932RY);
                        if (num != null) {
                            i &= -3;
                        } else {
                            throw AbstractC1167Vq.m2383G("versionCode", "versionCode", abstractC0932RY);
                        }
                    }
                } else {
                    str = (String) this.f9577h.mo1115z(abstractC0932RY);
                    if (str != null) {
                        i &= -2;
                    } else {
                        throw AbstractC1167Vq.m2383G("version", "version", abstractC0932RY);
                    }
                }
            } else {
                abstractC0932RY.mo2093Lq();
                abstractC0932RY.mo2092Ha();
            }
        }
        abstractC0932RY.mo2096V();
        if (i == -16) {
            return new MagiskJson(str, num.intValue(), str2, str3);
        }
        Constructor constructor = this.f9576P;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = MagiskJson.class.getDeclaredConstructor(String.class, cls, String.class, String.class, cls, AbstractC1167Vq.f3800v);
            this.f9576P = constructor;
        }
        return (MagiskJson) constructor.newInstance(str, num, str2, str3, Integer.valueOf(i), null);
    }
}
