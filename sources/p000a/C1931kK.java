package p000a;

import java.util.LinkedHashMap;

/* renamed from: a.kK */
/* loaded from: classes.dex */
public class C1931kK {

    /* renamed from: h */
    public static final LinkedHashMap f5996h = new LinkedHashMap();

    /* renamed from: z */
    public final LinkedHashMap f5997z = new LinkedHashMap();

    /* renamed from: h */
    public AbstractC2719zK mo2533h(String str) {
        if (C1665fK.m3144J(str)) {
            AbstractC2719zK abstractC2719zK = (AbstractC2719zK) this.f5997z.get(str);
            if (abstractC2719zK != null) {
                return abstractC2719zK;
            }
            throw new IllegalStateException(AbstractC2441tz.m4184G("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    /* renamed from: z */
    public final void m3550z(AbstractC2719zK abstractC2719zK) {
        boolean z;
        String m3154w = C1665fK.m3154w(abstractC2719zK.getClass());
        if (C1665fK.m3144J(m3154w)) {
            LinkedHashMap linkedHashMap = this.f5997z;
            AbstractC2719zK abstractC2719zK2 = (AbstractC2719zK) linkedHashMap.get(m3154w);
            if (!AbstractC1292YB.m2695u(abstractC2719zK2, abstractC2719zK)) {
                if (abstractC2719zK2 != null && abstractC2719zK2.f8554h) {
                    z = true;
                } else {
                    z = false;
                }
                if ((!z) != false) {
                    if ((!abstractC2719zK.f8554h) != false) {
                        AbstractC2719zK abstractC2719zK3 = (AbstractC2719zK) linkedHashMap.put(m3154w, abstractC2719zK);
                        return;
                    }
                    throw new IllegalStateException(("Navigator " + abstractC2719zK + " is already attached to another NavController").toString());
                }
                throw new IllegalStateException(("Navigator " + abstractC2719zK + " is replacing an already attached " + abstractC2719zK2).toString());
            }
            return;
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }
}
