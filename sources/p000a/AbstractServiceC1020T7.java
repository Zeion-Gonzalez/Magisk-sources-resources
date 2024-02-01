package p000a;

import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: a.T7 */
/* loaded from: classes.dex */
public abstract class AbstractServiceC1020T7 extends AbstractServiceC1875jK {

    /* renamed from: w */
    public static final C1112Up f3413w;

    /* renamed from: R */
    public int f3414R;

    /* renamed from: S */
    public final Map f3415S;

    static {
        new C1219Wm((AbstractC1050Tg) null);
        f3413w = new C1112Up();
    }

    public AbstractServiceC1020T7() {
        HashMap hashMap = new HashMap();
        C1146VR c1146vr = AbstractC2631xW.f8219z;
        this.f3415S = Collections.synchronizedMap(hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0050, code lost:
    
        if (r3 == false) goto L36;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.app.Notification.Builder m2197h(int r6) {
        /*
            r5 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.util.Map r1 = r5.f3415S
            java.lang.Object r0 = r1.remove(r0)
            android.app.Notification$Builder r0 = (android.app.Notification.Builder) r0
            if (r0 == 0) goto L52
            int r2 = r5.f3414R
            r3 = 0
            if (r2 == r6) goto L14
            goto L50
        L14:
            boolean r2 = r1.isEmpty()
            r4 = 1
            r2 = r2 ^ r4
            if (r2 == 0) goto L40
            java.util.Set r1 = r1.entrySet()
            java.lang.Object r1 = p000a.AbstractC2486us.m4289dG(r1)
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.getValue()
            android.app.Notification$Builder r1 = (android.app.Notification.Builder) r1
            android.app.Notification r1 = r1.build()
            r5.f3414R = r2
            r5.startForeground(r2, r1)
            goto L4f
        L40:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 < r2) goto L4a
            p000a.AbstractC2405tJ.m4138I(r5)
            goto L4d
        L4a:
            r5.stopForeground(r4)
        L4d:
            r5.f3414R = r3
        L4f:
            r3 = r4
        L50:
            if (r3 != 0) goto L59
        L52:
            android.app.NotificationManager r1 = p000a.AbstractC0392HR.m886z()
            r1.cancel(r6)
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractServiceC1020T7.m2197h(int):android.app.Notification$Builder");
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        Map map = this.f3415S;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            AbstractC0392HR.m886z().cancel(((Number) ((Map.Entry) it.next()).getKey()).intValue());
        }
        map.clear();
    }

    /* renamed from: v */
    public final void m2198v(int i, InterfaceC2364sT interfaceC2364sT) {
        Notification.Builder priority;
        Map map = this.f3415S;
        boolean z = (!map.isEmpty()) ^ true;
        Integer valueOf = Integer.valueOf(i);
        Object obj = map.get(valueOf);
        if (obj == null) {
            C1146VR c1146vr = AbstractC0392HR.f1320z;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 26) {
                AbstractC2441tz.m4192S();
                priority = AbstractC2494v.m4316h(AbstractC1743gn.m3275z());
            } else {
                priority = new Notification.Builder(AbstractC1743gn.m3275z()).setPriority(-1);
            }
            Notification.Builder ongoing = priority.setSmallIcon(17301633).setContentTitle("").setProgress(0, 0, true).setOngoing(true);
            if (i2 >= 31) {
                ongoing.setForegroundServiceBehavior(1);
            }
            map.put(valueOf, ongoing);
            obj = ongoing;
        }
        interfaceC2364sT.mo85W(obj);
        Notification build = ((Notification.Builder) obj).build();
        if (z) {
            this.f3414R = i;
            startForeground(i, build);
        } else {
            AbstractC0392HR.m886z().notify(i, build);
        }
    }

    /* renamed from: z */
    public final int m2199z(int i, C2375sg c2375sg) {
        Notification.Builder m2197h = m2197h(i);
        if (m2197h != null) {
            c2375sg.mo85W(m2197h);
            int incrementAndGet = AbstractC0392HR.f1319h.incrementAndGet();
            AbstractC0392HR.m886z().notify(incrementAndGet, m2197h.build());
            return incrementAndGet;
        }
        return -1;
    }
}
