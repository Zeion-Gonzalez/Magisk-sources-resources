package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import p000a.AbstractC0371H5;
import p000a.AbstractC1540d1;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: M */
    public static final PorterDuff.Mode f8921M = PorterDuff.Mode.SRC_IN;

    /* renamed from: G */
    public String f8922G;

    /* renamed from: N */
    public int f8923N;

    /* renamed from: P */
    public Parcelable f8924P;

    /* renamed from: Q */
    public int f8925Q;

    /* renamed from: W */
    public String f8926W;

    /* renamed from: h */
    public Object f8927h;

    /* renamed from: o */
    public PorterDuff.Mode f8928o;

    /* renamed from: u */
    public ColorStateList f8929u;

    /* renamed from: v */
    public byte[] f8930v;

    /* renamed from: z */
    public int f8931z;

    public IconCompat() {
        this.f8931z = -1;
        this.f8930v = null;
        this.f8924P = null;
        this.f8923N = 0;
        this.f8925Q = 0;
        this.f8929u = null;
        this.f8928o = f8921M;
        this.f8926W = null;
    }

    /* renamed from: z */
    public static Bitmap m4789z(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: h */
    public final String m4790h() {
        int i = this.f8931z;
        if (i == -1) {
            int i2 = Build.VERSION.SDK_INT;
            Object obj = this.f8927h;
            if (i2 >= 28) {
                return AbstractC0371H5.m857h(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                Log.e("IconCompat", "Unable to get icon package", e);
                return null;
            }
        }
        if (i == 2) {
            String str = this.f8922G;
            if (str != null && !TextUtils.isEmpty(str)) {
                return this.f8922G;
            }
            return ((String) this.f8927h).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public final String toString() {
        String str;
        int height;
        int i;
        if (this.f8931z == -1) {
            return String.valueOf(this.f8927h);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f8931z) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f8931z) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f8927h).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f8927h).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f8922G);
                sb.append(" id=");
                Object[] objArr = new Object[1];
                int i2 = this.f8931z;
                if (i2 == -1) {
                    int i3 = Build.VERSION.SDK_INT;
                    Object obj = this.f8927h;
                    if (i3 >= 28) {
                        i = AbstractC0371H5.m859z(obj);
                    } else {
                        try {
                            i = ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                            Log.e("IconCompat", "Unable to get icon resource", e);
                            i = 0;
                        }
                    }
                } else if (i2 == 2) {
                    i = this.f8923N;
                } else {
                    throw new IllegalStateException("called getResId() on " + this);
                }
                objArr[0] = Integer.valueOf(i);
                sb.append(String.format("0x%08x", objArr));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f8923N);
                if (this.f8925Q != 0) {
                    sb.append(" off=");
                    height = this.f8925Q;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f8927h);
                break;
        }
        if (this.f8929u != null) {
            sb.append(" tint=");
            sb.append(this.f8929u);
        }
        if (this.f8928o != f8921M) {
            sb.append(" mode=");
            sb.append(this.f8928o);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: v */
    public final Uri m4791v() {
        int i = this.f8931z;
        if (i == -1) {
            return AbstractC1540d1.m2987z(this.f8927h);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f8927h);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public IconCompat(int i) {
        this.f8930v = null;
        this.f8924P = null;
        this.f8923N = 0;
        this.f8925Q = 0;
        this.f8929u = null;
        this.f8928o = f8921M;
        this.f8926W = null;
        this.f8931z = i;
    }
}
