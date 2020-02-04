package com.tink.link.core.user

import android.net.Uri
import com.tink.link.core.credentials.CredentialRepository
import com.tink.link.core.provider.ProviderRepository
import com.tink.link.service.authorization.Scope
import com.tink.link.service.handler.ResultHandler

interface UserContext {
    val providerRepository: ProviderRepository
    val credentialRepository: CredentialRepository
    fun handleUri(uri: Uri, resultHandler: ResultHandler<Unit>? = null): Boolean
    fun authorize(scopes: Set<Scope>, resultHandler: ResultHandler<String>)
}