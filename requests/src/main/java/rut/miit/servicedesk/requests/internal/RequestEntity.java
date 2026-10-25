package rut.miit.servicedesk.requests.internal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.CodePointLength;
import rut.miit.servicedesk.requests.RequestStatus;

import java.time.LocalDateTime;

@Entity
@Table(name = "request")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "audience_id", nullable = false)
    private Long audienceId;

    @Column(name = "service_id", nullable = false)
    private Long serviceId;

    @Column(name = "department_id", nullable = false)
    private Long departmentId;

    @Column(name = "status", nullable = false)
    private RequestStatus status;

    @Column(name = "description")
    private String description;

    @Column(name = "comment")
    private String comment;

    @Column(name = "approver_id")
    private Long approverId;

    @Column(name = "confirmed_by")
    private Long confirmedBy;

    @Column(name = "executor_id")
    private Long executorId;

    @Column(name = "reject_reason")
    private String rejectReason;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "due_at")
    private LocalDateTime dueAt;

    @Column(name = "completed_at")
    private LocalDateTime completedAt;
}
