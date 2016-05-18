package cn.finalteam.rxgalleryfinal.di.component;

import cn.finalteam.rxgalleryfinal.di.module.MediaGridModule;
import cn.finalteam.rxgalleryfinal.di.scope.MediaGridScope;
import cn.finalteam.rxgalleryfinal.presenter.impl.MediaGridPresenterImpl;
import cn.finalteam.rxgalleryfinal.ui.fragment.ImageGridFragment;
import cn.finalteam.rxgalleryfinal.ui.fragment.VideoGridFragment;
import dagger.Component;

/**
 * Desction:
 * Author:pengjianbo
 * Date:16/5/18 下午5:08
 */
@MediaGridScope
@Component(dependencies = RxGalleryFinalComponent.class, modules = MediaGridModule.class)
public interface MediaGridComponent {
    void inject(ImageGridFragment imageGridFragment);
    void inject(VideoGridFragment videoGridFragment);

    MediaGridPresenterImpl provideMediaGridPresenter();
}
