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
public final class UpdateInfoJsonAdapter extends AbstractC1235X4 {

    /* renamed from: h */
    public final AbstractC1235X4 f9588h;

    /* renamed from: v */
    public volatile Constructor f9589v;

    /* renamed from: z */
    public final C1624eZ f9590z = C1624eZ.m3078M("magisk");

    public UpdateInfoJsonAdapter(C0657MQ c0657mq) {
        this.f9588h = c0657mq.m1460z(MagiskJson.class, C1460bR.f4549S, "magisk");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(UpdateInfo)");
        return sb.toString();
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: v */
    public final void mo1114v(AbstractC2626xP abstractC2626xP, Object obj) {
        UpdateInfo updateInfo = (UpdateInfo) obj;
        if (updateInfo != null) {
            abstractC2626xP.mo3923h();
            abstractC2626xP.mo3921V("magisk");
            this.f9588h.mo1114v(abstractC2626xP, updateInfo.f9587z);
            abstractC2626xP.mo3918G();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: z */
    public final Object mo1115z(AbstractC0932RY abstractC0932RY) {
        abstractC0932RY.mo2099h();
        MagiskJson magiskJson = null;
        int i = -1;
        while (abstractC0932RY.mo2103y()) {
            int mo2097ZH = abstractC0932RY.mo2097ZH(this.f9590z);
            if (mo2097ZH != -1) {
                if (mo2097ZH == 0) {
                    magiskJson = (MagiskJson) this.f9588h.mo1115z(abstractC0932RY);
                    if (magiskJson != null) {
                        i &= -2;
                    } else {
                        throw AbstractC1167Vq.m2383G("magisk", "magisk", abstractC0932RY);
                    }
                } else {
                    continue;
                }
            } else {
                abstractC0932RY.mo2093Lq();
                abstractC0932RY.mo2092Ha();
            }
        }
        abstractC0932RY.mo2096V();
        if (i == -2) {
            return new UpdateInfo(magiskJson);
        }
        Constructor constructor = this.f9589v;
        if (constructor == null) {
            constructor = UpdateInfo.class.getDeclaredConstructor(MagiskJson.class, Integer.TYPE, AbstractC1167Vq.f3800v);
            this.f9589v = constructor;
        }
        return (UpdateInfo) constructor.newInstance(magiskJson, Integer.valueOf(i), null);
    }
}
