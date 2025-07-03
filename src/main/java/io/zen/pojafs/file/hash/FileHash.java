package io.zen.pojafs.file.hash;

import io.zen.pojafs.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
