package ec.com.nttdata.accounts_movements_service.dto.movement.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ec.com.nttdata.accounts_movements_service.dto.retentions.OnCreate;
import ec.com.nttdata.accounts_movements_service.dto.retentions.OnUpdate;
import ec.com.nttdata.accounts_movements_service.enums.MovementTypeEnum;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovementRequest {
    @NotNull(message = "date cannot be null", groups = {OnCreate.class})
    private LocalDateTime date;
    @NotNull(message = "movementType cannot be null", groups = {OnCreate.class})
    private MovementTypeEnum movementType;
    @NotNull(message = "amount cannot be null", groups = {OnCreate.class})
    private BigDecimal amount;
    @NotNull(message = "account id cannot be null", groups = {OnCreate.class, OnUpdate.class})
    private Long accountId;
    @JsonIgnore
    private boolean isStart;
}
