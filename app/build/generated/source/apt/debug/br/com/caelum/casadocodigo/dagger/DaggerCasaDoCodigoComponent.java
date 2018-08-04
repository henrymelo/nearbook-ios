// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package br.com.caelum.casadocodigo.dagger;

import br.com.caelum.casadocodigo.activity.CarrinhoActivity;
import br.com.caelum.casadocodigo.activity.CarrinhoActivity_MembersInjector;
import br.com.caelum.casadocodigo.fragment.DetalhesLivroFragment;
import br.com.caelum.casadocodigo.fragment.DetalhesLivroFragment_MembersInjector;
import br.com.caelum.casadocodigo.modelo.Carrinho;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerCasaDoCodigoComponent implements CasaDoCodigoComponent {
  private Provider<Carrinho> getCarrinhoProvider;

  private MembersInjector<DetalhesLivroFragment> detalhesLivroFragmentMembersInjector;

  private MembersInjector<CarrinhoActivity> carrinhoActivityMembersInjector;

  private DaggerCasaDoCodigoComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static CasaDoCodigoComponent create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.getCarrinhoProvider =
        DoubleCheck.provider(
            CasaDoCodigoModule_GetCarrinhoFactory.create(builder.casaDoCodigoModule));

    this.detalhesLivroFragmentMembersInjector =
        DetalhesLivroFragment_MembersInjector.create(getCarrinhoProvider);

    this.carrinhoActivityMembersInjector =
        CarrinhoActivity_MembersInjector.create(getCarrinhoProvider);
  }

  @Override
  public void inject(DetalhesLivroFragment fragment) {
    detalhesLivroFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(CarrinhoActivity activity) {
    carrinhoActivityMembersInjector.injectMembers(activity);
  }

  public static final class Builder {
    private CasaDoCodigoModule casaDoCodigoModule;

    private Builder() {}

    public CasaDoCodigoComponent build() {
      if (casaDoCodigoModule == null) {
        this.casaDoCodigoModule = new CasaDoCodigoModule();
      }
      return new DaggerCasaDoCodigoComponent(this);
    }

    public Builder casaDoCodigoModule(CasaDoCodigoModule casaDoCodigoModule) {
      this.casaDoCodigoModule = Preconditions.checkNotNull(casaDoCodigoModule);
      return this;
    }
  }
}