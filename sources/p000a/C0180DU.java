package p000a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: a.DU */
/* loaded from: classes.dex */
public final class C0180DU {

    /* renamed from: G */
    public final Context f553G;

    /* renamed from: M */
    public final C0000A0 f554M;

    /* renamed from: W */
    public final TextView f558W;

    /* renamed from: o */
    public TextPaint f560o;

    /* renamed from: V */
    public static final RectF f552V = new RectF();

    /* renamed from: S */
    public static final ConcurrentHashMap f551S = new ConcurrentHashMap();

    /* renamed from: z */
    public int f563z = 0;

    /* renamed from: h */
    public boolean f559h = false;

    /* renamed from: v */
    public float f562v = -1.0f;

    /* renamed from: P */
    public float f556P = -1.0f;

    /* renamed from: N */
    public float f555N = -1.0f;

    /* renamed from: Q */
    public int[] f557Q = new int[0];

    /* renamed from: u */
    public boolean f561u = false;

    static {
        new ConcurrentHashMap();
    }

    public C0180DU(TextView textView) {
        this.f558W = textView;
        this.f553G = textView.getContext();
        this.f554M = Build.VERSION.SDK_INT >= 29 ? new C0296Fd() : new C0000A0();
    }

    /* renamed from: N */
    public static Object m351N(Object obj, String str, Object obj2) {
        try {
            return m352P(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj2;
        }
    }

    /* renamed from: P */
    public static Method m352P(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f551S;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: h */
    public static int[] m353h(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: G */
    public final void m354G(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f563z = 1;
        this.f556P = f;
        this.f555N = f2;
        this.f562v = f3;
        this.f561u = false;
    }

    /* renamed from: Q */
    public final void m355Q(int i, float f) {
        Resources resources;
        Context context = this.f553G;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        TextView textView = this.f558W;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean m3374z = AbstractC1817iE.m3374z(textView);
            if (textView.getLayout() != null) {
                this.f559h = false;
                try {
                    Method m352P = m352P("nullLayouts");
                    if (m352P != null) {
                        m352P.invoke(textView, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!m3374z) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* renamed from: W */
    public final boolean m356W() {
        return !(this.f558W instanceof C1672fR);
    }

    /* renamed from: o */
    public final boolean m357o() {
        boolean z = this.f557Q.length > 0;
        this.f561u = z;
        if (z) {
            this.f563z = 1;
            this.f556P = r0[0];
            this.f555N = r0[r1 - 1];
            this.f562v = -1.0f;
        }
        return z;
    }

    /* renamed from: u */
    public final boolean m358u() {
        if (m356W() && this.f563z == 1) {
            if (!this.f561u || this.f557Q.length == 0) {
                int floor = ((int) Math.floor((this.f555N - this.f556P) / this.f562v)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.f562v) + this.f556P);
                }
                this.f557Q = m353h(iArr);
            }
            this.f559h = true;
        } else {
            this.f559h = false;
        }
        return this.f559h;
    }

    /* renamed from: v */
    public final int m359v(RectF rectF) {
        boolean z;
        CharSequence transformation;
        int length = this.f557Q.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                int i5 = this.f557Q[i4];
                TextView textView = this.f558W;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    text = transformation;
                }
                int m1792h = AbstractC0785Od.m1792h(textView);
                TextPaint textPaint = this.f560o;
                if (textPaint == null) {
                    this.f560o = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f560o.set(textView.getPaint());
                this.f560o.setTextSize(i5);
                StaticLayout m3141z = AbstractC1664fJ.m3141z(text, (Layout.Alignment) m351N(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), m1792h, this.f558W, this.f560o, this.f554M);
                if ((m1792h != -1 && (m3141z.getLineCount() > m1792h || m3141z.getLineEnd(m3141z.getLineCount() - 1) != text.length())) || m3141z.getHeight() > rectF.bottom) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    int i6 = i4 + 1;
                    i3 = i2;
                    i2 = i6;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f557Q[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: z */
    public final void m360z() {
        boolean z;
        int measuredWidth;
        if (m356W() && this.f563z != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        if (this.f559h) {
            if (this.f558W.getMeasuredHeight() > 0 && this.f558W.getMeasuredWidth() > 0) {
                if (this.f554M.mo625h(this.f558W)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.f558W.getMeasuredWidth() - this.f558W.getTotalPaddingLeft()) - this.f558W.getTotalPaddingRight();
                }
                int height = (this.f558W.getHeight() - this.f558W.getCompoundPaddingBottom()) - this.f558W.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = f552V;
                    synchronized (rectF) {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float m359v = m359v(rectF);
                        if (m359v != this.f558W.getTextSize()) {
                            m355Q(0, m359v);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f559h = true;
    }
}
