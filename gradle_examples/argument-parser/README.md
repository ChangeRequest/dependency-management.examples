Argument Parser
===============

This is a test-module with an `ArgumentsParser` library implementation.

# How to sign the JAR

In order to sign the created JAR files, install the [GPG][1] and create a secret key:

```bash
gpg --gen-key
```

After that, export your secret key to a safe location (DO NOT STORE IT IN THE REPOSITORY!):

```bash
gpg --export-secret-keys > ~/.gnupg/secring.gpg
```

And configure the signing plugin with your key information.

The key ID can be found with the following command:

```bash
gpg --list-keys --keyid-format 0xSHORT
```

[1]: https://www.gnupg.org/