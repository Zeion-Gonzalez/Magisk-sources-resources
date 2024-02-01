package p000a;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: a.Nq */
/* loaded from: classes.dex */
public final class C0737Nq {

    /* renamed from: U */
    public static final InterpolatorC0315G0 f2489U = new InterpolatorC0315G0(0);

    /* renamed from: G */
    public int[] f2490G;

    /* renamed from: I */
    public final OverScroller f2491I;

    /* renamed from: M */
    public int f2492M;

    /* renamed from: N */
    public float[] f2493N;

    /* renamed from: P */
    public float[] f2494P;

    /* renamed from: Q */
    public float[] f2495Q;

    /* renamed from: R */
    public final float f2496R;

    /* renamed from: S */
    public final float f2497S;

    /* renamed from: V */
    public VelocityTracker f2498V;

    /* renamed from: W */
    public int[] f2499W;

    /* renamed from: g */
    public boolean f2500g;

    /* renamed from: h */
    public int f2501h;

    /* renamed from: k */
    public View f2502k;

    /* renamed from: o */
    public int[] f2503o;

    /* renamed from: q */
    public final AbstractC1843ih f2504q;

    /* renamed from: u */
    public float[] f2506u;

    /* renamed from: w */
    public final int f2508w;

    /* renamed from: y */
    public final ViewGroup f2509y;

    /* renamed from: z */
    public int f2510z;

    /* renamed from: v */
    public int f2507v = -1;

    /* renamed from: s */
    public final RunnableC1286Y5 f2505s = new RunnableC1286Y5(4, this);

    public C0737Nq(Context context, ViewGroup viewGroup, AbstractC1843ih abstractC1843ih) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC1843ih == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f2509y = viewGroup;
        this.f2504q = abstractC1843ih;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2508w = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f2501h = viewConfiguration.getScaledTouchSlop();
        this.f2497S = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2496R = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2491I = new OverScroller(context, f2489U);
    }

    /* renamed from: G */
    public final boolean m1689G(int i) {
        boolean z;
        if ((this.f2492M & (1 << i)) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: I */
    public final void m1690I(int i) {
        this.f2509y.removeCallbacks(this.f2505s);
        if (this.f2510z != i) {
            this.f2510z = i;
            this.f2504q.mo1678nP(i);
            if (this.f2510z == 0) {
                this.f2502k = null;
            }
        }
    }

    /* renamed from: M */
    public final void m1691M(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m1707z();
        }
        if (this.f2498V == null) {
            this.f2498V = VelocityTracker.obtain();
        }
        this.f2498V.addMovement(motionEvent);
        int i2 = 0;
        AbstractC1843ih abstractC1843ih = this.f2504q;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f2510z == 1 && pointerId == this.f2507v) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i2 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i2);
                                            if (pointerId2 != this.f2507v) {
                                                View m1702o = m1702o((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                                View view = this.f2502k;
                                                if (m1702o == view && m1699g(view, pointerId2)) {
                                                    i = this.f2507v;
                                                    break;
                                                }
                                            }
                                            i2++;
                                        } else {
                                            i = -1;
                                            break;
                                        }
                                    }
                                    if (i == -1) {
                                        m1697V();
                                    }
                                }
                                m1692N(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x = motionEvent.getX(actionIndex);
                        float y = motionEvent.getY(actionIndex);
                        m1695R(x, y, pointerId3);
                        if (this.f2510z == 0) {
                            m1699g(m1702o((int) x, (int) y), pointerId3);
                            if ((this.f2503o[pointerId3] & 0) == 0) {
                                return;
                            }
                        } else {
                            int i3 = (int) x;
                            int i4 = (int) y;
                            View view2 = this.f2502k;
                            if (view2 != null && i3 >= view2.getLeft() && i3 < view2.getRight() && i4 >= view2.getTop() && i4 < view2.getBottom()) {
                                i2 = 1;
                            }
                            if (i2 != 0) {
                                m1699g(this.f2502k, pointerId3);
                                return;
                            }
                            return;
                        }
                    } else if (this.f2510z == 1) {
                        this.f2500g = true;
                        abstractC1843ih.mo1679qn(this.f2502k, 0.0f, 0.0f);
                        this.f2500g = false;
                        if (this.f2510z == 1) {
                            m1690I(0);
                        }
                    }
                } else {
                    if (this.f2510z == 1) {
                        if (m1689G(this.f2507v)) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f2507v);
                            float x2 = motionEvent.getX(findPointerIndex);
                            float y2 = motionEvent.getY(findPointerIndex);
                            float[] fArr = this.f2495Q;
                            int i5 = this.f2507v;
                            int i6 = (int) (x2 - fArr[i5]);
                            int i7 = (int) (y2 - this.f2506u[i5]);
                            int left = this.f2502k.getLeft() + i6;
                            int top = this.f2502k.getTop() + i7;
                            int left2 = this.f2502k.getLeft();
                            int top2 = this.f2502k.getTop();
                            if (i6 != 0) {
                                left = abstractC1843ih.mo1674S(this.f2502k, left);
                                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                                this.f2502k.offsetLeftAndRight(left - left2);
                            }
                            if (i7 != 0) {
                                top = abstractC1843ih.mo1673R(this.f2502k, top);
                                WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                                this.f2502k.offsetTopAndBottom(top - top2);
                            }
                            if (i6 != 0 || i7 != 0) {
                                abstractC1843ih.mo1675Yd(this.f2502k, left, top);
                            }
                        } else {
                            return;
                        }
                    } else {
                        int pointerCount2 = motionEvent.getPointerCount();
                        while (i2 < pointerCount2) {
                            int pointerId4 = motionEvent.getPointerId(i2);
                            if (m1689G(pointerId4)) {
                                float x3 = motionEvent.getX(i2);
                                float y3 = motionEvent.getY(i2);
                                float f = x3 - this.f2494P[pointerId4];
                                float f2 = y3 - this.f2493N[pointerId4];
                                m1696S(f, f2, pointerId4);
                                if (this.f2510z != 1) {
                                    View m1702o2 = m1702o((int) x3, (int) y3);
                                    if (m1693P(m1702o2, f, f2) && m1699g(m1702o2, pointerId4)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i2++;
                        }
                    }
                    m1706w(motionEvent);
                    return;
                }
            } else if (this.f2510z == 1) {
                m1697V();
            }
            m1707z();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View m1702o3 = m1702o((int) x4, (int) y4);
        m1695R(x4, y4, pointerId5);
        m1699g(m1702o3, pointerId5);
        if ((this.f2503o[pointerId5] & 0) == 0) {
            return;
        }
        abstractC1843ih.getClass();
    }

    /* renamed from: N */
    public final void m1692N(int i) {
        float[] fArr = this.f2494P;
        if (fArr != null) {
            int i2 = this.f2492M;
            boolean z = true;
            int i3 = 1 << i;
            if ((i3 & i2) == 0) {
                z = false;
            }
            if (z) {
                fArr[i] = 0.0f;
                this.f2493N[i] = 0.0f;
                this.f2495Q[i] = 0.0f;
                this.f2506u[i] = 0.0f;
                this.f2503o[i] = 0;
                this.f2499W[i] = 0;
                this.f2490G[i] = 0;
                this.f2492M = (~i3) & i2;
            }
        }
    }

    /* renamed from: P */
    public final boolean m1693P(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        AbstractC1843ih abstractC1843ih = this.f2504q;
        boolean z = abstractC1843ih.mo2818O(view) > 0;
        boolean z2 = abstractC1843ih.mo1676n() > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f2501h) : z2 && Math.abs(f2) > ((float) this.f2501h);
        }
        float f3 = (f2 * f2) + (f * f);
        int i = this.f2501h;
        return f3 > ((float) (i * i));
    }

    /* renamed from: Q */
    public final int m1694Q(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        float width = this.f2509y.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    /* renamed from: R */
    public final void m1695R(float f, float f2, int i) {
        float[] fArr = this.f2494P;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2493N;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f2495Q;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2506u;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f2503o;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2499W;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f2490G;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2494P = fArr2;
            this.f2493N = fArr3;
            this.f2495Q = fArr4;
            this.f2506u = fArr5;
            this.f2503o = iArr;
            this.f2499W = iArr2;
            this.f2490G = iArr3;
        }
        float[] fArr9 = this.f2494P;
        this.f2495Q[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f2493N;
        this.f2506u[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f2503o;
        int i4 = (int) f;
        int i5 = (int) f2;
        ViewGroup viewGroup = this.f2509y;
        int left = viewGroup.getLeft();
        int i6 = this.f2508w;
        if (i4 < left + i6) {
            i2 = 1;
        }
        if (i5 < viewGroup.getTop() + i6) {
            i2 |= 4;
        }
        if (i4 > viewGroup.getRight() - i6) {
            i2 |= 2;
        }
        if (i5 > viewGroup.getBottom() - i6) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.f2492M |= 1 << i;
    }

    /* renamed from: S */
    public final void m1696S(float f, float f2, int i) {
        boolean m1705v = m1705v(f, f2, i, 1);
        if (m1705v(f2, f, i, 4)) {
            m1705v |= true;
        }
        if (m1705v(f, f2, i, 2)) {
            m1705v |= true;
        }
        if (m1705v(f2, f, i, 8)) {
            m1705v |= true;
        }
        if (m1705v) {
            int[] iArr = this.f2499W;
            iArr[i] = iArr[i] | m1705v;
            this.f2504q.getClass();
        }
    }

    /* renamed from: V */
    public final void m1697V() {
        VelocityTracker velocityTracker = this.f2498V;
        float f = this.f2497S;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f2498V.getXVelocity(this.f2507v);
        float abs = Math.abs(xVelocity);
        float f2 = this.f2496R;
        float f3 = 0.0f;
        if (abs < f2) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            if (xVelocity > 0.0f) {
                xVelocity = f;
            } else {
                xVelocity = -f;
            }
        }
        float yVelocity = this.f2498V.getYVelocity(this.f2507v);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f2) {
            if (abs2 > f) {
                if (yVelocity <= 0.0f) {
                    f = -f;
                }
                f3 = f;
            } else {
                f3 = yVelocity;
            }
        }
        this.f2500g = true;
        this.f2504q.mo1679qn(this.f2502k, xVelocity, f3);
        this.f2500g = false;
        if (this.f2510z == 1) {
            m1690I(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0065  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1698W(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f2502k
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f2502k
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f2491I
            r11 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r10.m1690I(r11)
            return r11
        L1e:
            android.view.View r12 = r10.f2502k
            float r0 = r10.f2496R
            int r0 = (int) r0
            float r6 = r10.f2497S
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L2e
            r13 = r11
            goto L35
        L2e:
            if (r7 <= r6) goto L35
            if (r13 <= 0) goto L34
            r13 = r6
            goto L35
        L34:
            int r13 = -r6
        L35:
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L3c
            goto L43
        L3c:
            if (r7 <= r6) goto L44
            if (r14 <= 0) goto L42
            r14 = r6
            goto L44
        L42:
            int r11 = -r6
        L43:
            r14 = r11
        L44:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L5d
            float r11 = (float) r6
            float r6 = (float) r8
            goto L5f
        L5d:
            float r11 = (float) r11
            float r6 = (float) r9
        L5f:
            float r11 = r11 / r6
            if (r14 == 0) goto L65
            float r0 = (float) r7
            float r6 = (float) r8
            goto L67
        L65:
            float r0 = (float) r0
            float r6 = (float) r9
        L67:
            float r0 = r0 / r6
            a.ih r6 = r10.f2504q
            int r12 = r6.mo2818O(r12)
            int r12 = r10.m1694Q(r4, r13, r12)
            int r13 = r6.mo1676n()
            int r13 = r10.m1694Q(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.m1690I(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0737Nq.m1698W(int, int, int, int):boolean");
    }

    /* renamed from: g */
    public final boolean m1699g(View view, int i) {
        if (view == this.f2502k && this.f2507v == i) {
            return true;
        }
        if (view == null || !this.f2504q.mo1677nB(view, i)) {
            return false;
        }
        this.f2507v = i;
        m1700h(view, i);
        return true;
    }

    /* renamed from: h */
    public final void m1700h(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f2509y;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f2502k = view;
        this.f2507v = i;
        this.f2504q.mo2819b(view, i);
        m1690I(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0057, code lost:
    
        if ((r18.f2503o[r2] & 0) != 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0059, code lost:
    
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00d2, code lost:
    
        if (r13 != r12) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x011c, code lost:
    
        if ((r18.f2503o[r1] & 0) != 0) goto L110;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1701k(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0737Nq.m1701k(android.view.MotionEvent):boolean");
    }

    /* renamed from: o */
    public final View m1702o(int i, int i2) {
        ViewGroup viewGroup = this.f2509y;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f2504q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: q */
    public final boolean m1703q(int i, int i2) {
        if (this.f2500g) {
            return m1698W(i, i2, (int) this.f2498V.getXVelocity(this.f2507v), (int) this.f2498V.getYVelocity(this.f2507v));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: u */
    public final boolean m1704u() {
        if (this.f2510z == 2) {
            OverScroller overScroller = this.f2491I;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f2502k.getLeft();
            int top = currY - this.f2502k.getTop();
            if (left != 0) {
                View view = this.f2502k;
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f2502k;
                WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f2504q.mo1675Yd(this.f2502k, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f2509y.post(this.f2505s);
            }
        }
        if (this.f2510z != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final boolean m1705v(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f2503o[i] & i2) != i2 || (0 & i2) == 0 || (this.f2490G[i] & i2) == i2 || (this.f2499W[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f2501h;
        if (abs <= i3 && abs2 <= i3) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f2504q.getClass();
        }
        return (this.f2499W[i] & i2) == 0 && abs > ((float) this.f2501h);
    }

    /* renamed from: w */
    public final void m1706w(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m1689G(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f2495Q[pointerId] = x;
                this.f2506u[pointerId] = y;
            }
        }
    }

    /* renamed from: z */
    public final void m1707z() {
        this.f2507v = -1;
        float[] fArr = this.f2494P;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f2493N, 0.0f);
            Arrays.fill(this.f2495Q, 0.0f);
            Arrays.fill(this.f2506u, 0.0f);
            Arrays.fill(this.f2503o, 0);
            Arrays.fill(this.f2499W, 0);
            Arrays.fill(this.f2490G, 0);
            this.f2492M = 0;
        }
        VelocityTracker velocityTracker = this.f2498V;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2498V = null;
        }
    }
}
