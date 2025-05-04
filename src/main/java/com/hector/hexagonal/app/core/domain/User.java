package com.hector.hexagonal.app.core.domain;

import lombok.*;

public record User(@With String firstName, @With String lastName) {
}
