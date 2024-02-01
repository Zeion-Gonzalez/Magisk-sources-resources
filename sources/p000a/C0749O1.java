package p000a;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: a.O1 */
/* loaded from: classes.dex */
public class C0749O1 {

    /* renamed from: v */
    public static final int[] f2553v = {16843067, 16843068};

    /* renamed from: h */
    public Bitmap f2554h;

    /* renamed from: z */
    public final ProgressBar f2555z;

    public C0749O1(ProgressBar progressBar) {
        this.f2555z = progressBar;
    }

    /* renamed from: h */
    public final Drawable m1722h(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof InterfaceC2517vM) {
            ((AbstractC1486bz) ((InterfaceC2517vM) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    Drawable drawable2 = layerDrawable.getDrawable(i);
                    if (id != 16908301 && id != 16908303) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    drawableArr[i] = m1722h(drawable2, z2);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                    layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                    layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                    layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                    layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                    layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                    layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                    layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                    layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f2554h == null) {
                    this.f2554h = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                if (z) {
                    return new ClipDrawable(shapeDrawable, 3, 1);
                }
                return shapeDrawable;
            }
        }
        return drawable;
    }

    /* renamed from: z */
    public void mo1723z(AttributeSet attributeSet, int i) {
        ProgressBar progressBar = this.f2555z;
        C2709z9 m4639S = C2709z9.m4639S(progressBar.getContext(), attributeSet, f2553v, i);
        Drawable m4644Q = m4639S.m4644Q(0);
        if (m4644Q != null) {
            if (m4644Q instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) m4644Q;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable m1722h = m1722h(animationDrawable.getFrame(i2), true);
                    m1722h.setLevel(10000);
                    animationDrawable2.addFrame(m1722h, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                m4644Q = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(m4644Q);
        }
        Drawable m4644Q2 = m4639S.m4644Q(1);
        if (m4644Q2 != null) {
            progressBar.setProgressDrawable(m1722h(m4644Q2, false));
        }
        m4639S.m4651w();
    }
}
