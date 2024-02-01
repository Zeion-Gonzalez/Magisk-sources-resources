package p000a;

import android.database.Cursor;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import androidx.databinding.AbstractC2760z;
import androidx.lifecycle.AbstractC2764h;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.Reference;
import java.util.WeakHashMap;

/* renamed from: a.Y5 */
/* loaded from: classes.dex */
public final class RunnableC1286Y5 implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ Object f4119R;

    /* renamed from: S */
    public final /* synthetic */ int f4120S;

    public /* synthetic */ RunnableC1286Y5(int i, Object obj) {
        this.f4120S = i;
        this.f4119R = obj;
    }

    /* renamed from: h */
    private void m2637h() {
        Object obj;
        synchronized (((AbstractC2764h) this.f4119R).f9023z) {
            obj = ((AbstractC2764h) this.f4119R).f9017Q;
            ((AbstractC2764h) this.f4119R).f9017Q = AbstractC2764h.f9013M;
        }
        ((AbstractC2764h) this.f4119R).mo2290G(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b4 A[ORIG_RETURN, RETURN] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m2638v() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f4119R
            a.pi r0 = (p000a.C2213pi) r0
            a.fj r0 = r0.f6817z
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.f5281W
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            r1 = 1
            java.lang.Object r2 = r5.f4119R     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            a.pi r2 = (p000a.C2213pi) r2     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            boolean r2 = r2.m3855z()     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            if (r2 != 0) goto L25
        L1a:
            r0.unlock()
            java.lang.Object r0 = r5.f4119R
            a.pi r0 = (p000a.C2213pi) r0
            r0.getClass()
            return
        L25:
            java.lang.Object r2 = r5.f4119R     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            a.pi r2 = (p000a.C2213pi) r2     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.f6808N     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            r3 = 0
            boolean r2 = r2.compareAndSet(r1, r3)     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            if (r2 != 0) goto L33
            goto L1a
        L33:
            java.lang.Object r2 = r5.f4119R     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            a.pi r2 = (p000a.C2213pi) r2     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            a.fj r2 = r2.f6817z     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            boolean r2 = r2.m3187W()     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            if (r2 == 0) goto L40
            goto L1a
        L40:
            java.lang.Object r2 = r5.f4119R     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            a.pi r2 = (p000a.C2213pi) r2     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            a.fj r2 = r2.f6817z     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            a.ON r2 = r2.f5278P     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            if (r2 != 0) goto L4b
            r2 = 0
        L4b:
            a.VG r2 = r2.mo1790l()     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            r2.mo1942d()     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            a.Sl r3 = r5.m2639z()     // Catch: java.lang.Throwable -> L5d
            r2.mo1943e()     // Catch: java.lang.Throwable -> L5d
            r2.mo1946o()     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            goto L78
        L5d:
            r3 = move-exception
            r2.mo1946o()     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            throw r3     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
        L62:
            r1 = move-exception
            goto Lb5
        L64:
            r2 = move-exception
            java.lang.String r3 = "ROOM"
            java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L62
        L6c:
            a.bR r3 = p000a.C1460bR.f4549S     // Catch: java.lang.Throwable -> L62
            goto L78
        L6f:
            r2 = move-exception
            java.lang.String r3 = "ROOM"
            java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L62
            goto L6c
        L78:
            r0.unlock()
            java.lang.Object r0 = r5.f4119R
            a.pi r0 = (p000a.C2213pi) r0
            r0.getClass()
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ r1
            if (r0 == 0) goto Lb4
            java.lang.Object r0 = r5.f4119R
            a.pi r0 = (p000a.C2213pi) r0
            a.hf r1 = r0.f6812W
            monitor-enter(r1)
            a.hf r0 = r0.f6812W     // Catch: java.lang.Throwable -> Lb1
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lb1
        L96:
            r2 = r0
            a.gB r2 = (p000a.AbstractC1712gB) r2     // Catch: java.lang.Throwable -> Lb1
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> Lb1
            if (r4 == 0) goto Laf
            java.lang.Object r2 = r2.next()     // Catch: java.lang.Throwable -> Lb1
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> Lb1
            a.e7 r2 = (p000a.AbstractC1600e7) r2     // Catch: java.lang.Throwable -> Lb1
            r2.m3074z(r3)     // Catch: java.lang.Throwable -> Lb1
            goto L96
        Laf:
            monitor-exit(r1)
            goto Lb4
        Lb1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        Lb4:
            return
        Lb5:
            r0.unlock()
            java.lang.Object r0 = r5.f4119R
            a.pi r0 = (p000a.C2213pi) r0
            r0.getClass()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.RunnableC1286Y5.m2638v():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2189pE c2189pE;
        boolean z = true;
        switch (this.f4120S) {
            case AbstractC0795Op.f2698E /* 0 */:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        return;
                    } else {
                        throw e;
                    }
                } catch (NullPointerException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
            case 1:
                C2003lg c2003lg = (C2003lg) this.f4119R;
                Window.Callback callback = c2003lg.f6227v;
                C2189pE m3627Z = c2003lg.m3627Z();
                if (m3627Z instanceof C2189pE) {
                    c2189pE = m3627Z;
                } else {
                    c2189pE = null;
                }
                if (c2189pE != null) {
                    c2189pE.m3792E();
                }
                try {
                    m3627Z.clear();
                    if (!callback.onCreatePanelMenu(0, m3627Z) || !callback.onPreparePanel(0, null, m3627Z)) {
                        m3627Z.clear();
                    }
                    if (c2189pE != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (c2189pE != null) {
                        c2189pE.m3794U();
                    }
                }
            case 2:
                AbstractC0913RC abstractC0913RC = (AbstractC0913RC) this.f4119R;
                abstractC0913RC.m2068z(true);
                abstractC0913RC.invalidateSelf();
                return;
            case 3:
                ViewOnTouchListenerC0220EB viewOnTouchListenerC0220EB = (ViewOnTouchListenerC0220EB) this.f4119R;
                if (viewOnTouchListenerC0220EB.f697J) {
                    if (viewOnTouchListenerC0220EB.f707r) {
                        viewOnTouchListenerC0220EB.f707r = false;
                        C2017lw c2017lw = viewOnTouchListenerC0220EB.f699S;
                        c2017lw.getClass();
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c2017lw.f6263N = currentAnimationTimeMillis;
                        c2017lw.f6269u = -1L;
                        c2017lw.f6265Q = currentAnimationTimeMillis;
                        c2017lw.f6268o = 0.5f;
                    }
                    C2017lw c2017lw2 = viewOnTouchListenerC0220EB.f699S;
                    if (c2017lw2.f6269u <= 0 || AnimationUtils.currentAnimationTimeMillis() <= c2017lw2.f6269u + c2017lw2.f6266W) {
                        z = false;
                    }
                    if (!z && viewOnTouchListenerC0220EB.m425Q()) {
                        if (viewOnTouchListenerC0220EB.f701Y) {
                            viewOnTouchListenerC0220EB.f701Y = false;
                            long uptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                            viewOnTouchListenerC0220EB.f709w.onTouchEvent(obtain);
                            obtain.recycle();
                        }
                        if (c2017lw2.f6265Q != 0) {
                            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                            float m3655z = c2017lw2.m3655z(currentAnimationTimeMillis2);
                            long j = currentAnimationTimeMillis2 - c2017lw2.f6265Q;
                            c2017lw2.f6265Q = currentAnimationTimeMillis2;
                            AbstractC1402aJ.m2821h(viewOnTouchListenerC0220EB.f695H, (int) (((float) j) * ((m3655z * 4.0f) + ((-4.0f) * m3655z * m3655z)) * c2017lw2.f6264P));
                            View view = viewOnTouchListenerC0220EB.f709w;
                            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                            AbstractC2397t8.m4120S(view, this);
                            return;
                        }
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    viewOnTouchListenerC0220EB.f697J = false;
                    return;
                }
                return;
            case 4:
                ((C0737Nq) this.f4119R).m1690I(0);
                return;
            case 5:
                synchronized (this) {
                    ((AbstractC2760z) this.f4119R).f8986w = false;
                }
                while (true) {
                    Reference poll = AbstractC2760z.f8966C.poll();
                    if (poll != null) {
                        if (poll instanceof C0376HA) {
                            ((C0376HA) poll).m866h();
                        }
                    } else {
                        if (!((AbstractC2760z) this.f4119R).f8982k.isAttachedToWindow()) {
                            View view2 = ((AbstractC2760z) this.f4119R).f8982k;
                            ViewOnAttachStateChangeListenerC0544KF viewOnAttachStateChangeListenerC0544KF = AbstractC2760z.f8973p;
                            view2.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0544KF);
                            ((AbstractC2760z) this.f4119R).f8982k.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0544KF);
                            return;
                        }
                        ((AbstractC2760z) this.f4119R).m4817W();
                        return;
                    }
                }
            case 6:
                m2637h();
                return;
            case 7:
                m2638v();
                return;
            case 8:
                C2271qk c2271qk = (C2271qk) this.f4119R;
                c2271qk.f6985v = false;
                C0737Nq c0737Nq = ((BottomSheetBehavior) c2271qk.f6982N).f9255d;
                if (c0737Nq != null && c0737Nq.m1704u()) {
                    c2271qk.m3909z(c2271qk.f6984h);
                    return;
                }
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c2271qk.f6982N;
                if (bottomSheetBehavior.f9260i == 2) {
                    bottomSheetBehavior.m5005F(c2271qk.f6984h);
                    return;
                }
                return;
            default:
                ((C1473bg) this.f4119R).getClass();
                AbstractC0017AI.m44z(AbstractC2441tz.m4200k("pm uninstall ", AbstractC1743gn.m3273h().getPackageName())).mo781dx();
                return;
        }
    }

    /* renamed from: z */
    public final C1000Sl m2639z() {
        C2213pi c2213pi = (C2213pi) this.f4119R;
        C1000Sl c1000Sl = new C1000Sl();
        Cursor m3185S = c2213pi.f6817z.m3185S(new C0163DA("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
        while (m3185S.moveToNext()) {
            try {
                c1000Sl.add(Integer.valueOf(m3185S.getInt(0)));
            } finally {
            }
        }
        AbstractC1292YB.m2659R(m3185S, null);
        C1000Sl m2647G = AbstractC1292YB.m2647G(c1000Sl);
        if ((!m2647G.isEmpty()) != false) {
            if (((C2213pi) this.f4119R).f6815u != null) {
                InterfaceC2721zM interfaceC2721zM = ((C2213pi) this.f4119R).f6815u;
                if (interfaceC2721zM != null) {
                    interfaceC2721zM.mo4350p();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return m2647G;
    }
}
