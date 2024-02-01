/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.reply.data

/**
 * Una clase de enumeración para definir diferentes tipos de carpetas o categorías de correo electrónico.
 */
enum class MailboxType {
    Inbox,  //Bandeja de entrada
    Drafts, //Borradores
    Sent,   //Enviados
    Spam,   //Correo no deseado
}
