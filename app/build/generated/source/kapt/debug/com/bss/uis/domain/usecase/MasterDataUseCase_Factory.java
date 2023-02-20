// Generated by Dagger (https://dagger.dev).
package com.bss.uis.domain.usecase;

import com.bss.uis.domain.repository.Repository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MasterDataUseCase_Factory implements Factory<MasterDataUseCase> {
  private final Provider<Repository> repositoryProvider;

  public MasterDataUseCase_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public MasterDataUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static MasterDataUseCase_Factory create(Provider<Repository> repositoryProvider) {
    return new MasterDataUseCase_Factory(repositoryProvider);
  }

  public static MasterDataUseCase newInstance(Repository repository) {
    return new MasterDataUseCase(repository);
  }
}
